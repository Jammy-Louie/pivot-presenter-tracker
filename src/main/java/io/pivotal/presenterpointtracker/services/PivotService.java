package io.pivotal.presenterpointtracker.services;

import io.pivotal.presenterpointtracker.model.Pivot;
import io.pivotal.presenterpointtracker.repositories.jpa.PivotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PivotService {

    private PivotRepository pivotRepository;

    @Autowired
    public PivotService(PivotRepository pivotRepository) {
        this.pivotRepository = pivotRepository;
    }

    public List<Pivot> getAllPivots (){
        return this.pivotRepository.findAll();
    }

    public Pivot getPivot(long pivotId){ return this.pivotRepository.findOne(pivotId); }

    public void updateUser( Pivot pivot ){
        this.pivotRepository.save(pivot);
    }
}
