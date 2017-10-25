package io.pivotal.presenterpointtracker.repositories.jpa;

import io.pivotal.presenterpointtracker.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<Presentation, Long>{
}
