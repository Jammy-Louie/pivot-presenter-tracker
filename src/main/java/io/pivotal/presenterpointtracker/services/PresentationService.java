package io.pivotal.presenterpointtracker.services;

import io.pivotal.presenterpointtracker.model.Presentation;
import io.pivotal.presenterpointtracker.repositories.jpa.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresentationService {

    PresentationRepository presentationRepository;

    @Autowired
    public PresentationService(PresentationRepository presentationRepository) {
        this.presentationRepository = presentationRepository;
    }

    public List<Presentation> getAllPresentations(){
        return this.presentationRepository.findAll();
    }

    public Presentation getPresentation(long id){
        return this.presentationRepository.findOne(id);
    }

    public void savePresentation(Presentation presentation){
        this.presentationRepository.save(presentation);
    }
}
