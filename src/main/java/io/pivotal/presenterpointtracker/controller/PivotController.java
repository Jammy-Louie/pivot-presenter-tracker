package io.pivotal.presenterpointtracker.controller;

import io.pivotal.presenterpointtracker.model.Pivot;
import io.pivotal.presenterpointtracker.services.PivotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PivotController {

    PivotService pivotService;

    @Autowired
    public PivotController(PivotService pivotService) {
        this.pivotService = pivotService;
    }

    @GetMapping("get-all-pivots")
    public ResponseEntity<List<Pivot>> getAllPivots (){
        return new ResponseEntity<>(this.pivotService.getAllPivots(), HttpStatus.OK);
    }

}
