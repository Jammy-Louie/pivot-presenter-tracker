package io.pivotal.presenterpointtracker.controller;

import io.pivotal.presenterpointtracker.controller.payload.UpdatePivotPayload;
import io.pivotal.presenterpointtracker.model.Pivot;
import io.pivotal.presenterpointtracker.model.Presentation;
import io.pivotal.presenterpointtracker.services.PivotService;
import io.pivotal.presenterpointtracker.services.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PresentationController {

    private PresentationService presentationService;
    private PivotService pivotService;

    @Autowired
    public PresentationController(PresentationService presentationService, PivotService pivotService) {
        this.presentationService = presentationService;
        this.pivotService = pivotService;
    }

    @GetMapping("get-all-presentations")
    public ResponseEntity<List<Presentation>> getAllPresentation(){
        return new ResponseEntity<>(this.presentationService.getAllPresentations(),HttpStatus.OK);
    }

    @PostMapping(value = "save-pivot-presenter", headers="Accept=application/json")
    public ResponseEntity<Presentation> savePivotPresenter(@RequestBody UpdatePivotPayload updatePivotPayLoad){
        Pivot pivot = this.pivotService.getPivot(updatePivotPayLoad.getPivotId());
        Presentation presentation = this.presentationService.getPresentation(updatePivotPayLoad.getActivityId());
        presentation.setLastPresentedPivot(pivot);
        presentationService.savePresentation(presentation);
        return new ResponseEntity<Presentation>(presentation, HttpStatus.OK);
    }
}
