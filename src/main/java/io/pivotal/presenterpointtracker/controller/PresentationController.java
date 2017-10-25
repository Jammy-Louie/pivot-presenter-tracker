package io.pivotal.presenterpointtracker.controller;

import io.pivotal.presenterpointtracker.model.Presentation;
import io.pivotal.presenterpointtracker.services.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PresentationController {

    private PresentationService presentationService;

    @Autowired
    public PresentationController(PresentationService presentationService) {
        this.presentationService = presentationService;
    }

    @GetMapping("get-all-presentations")
    public ResponseEntity<List<Presentation>> getAllPresentation(){
        return new ResponseEntity<>(this.presentationService.getAllPresentations(),HttpStatus.OK);
    }

}
