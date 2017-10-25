package io.pivotal.presenterpointtracker.repositories.jpa;

import io.pivotal.presenterpointtracker.model.Pivot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PivotRepository extends JpaRepository<Pivot, Long>{
}
