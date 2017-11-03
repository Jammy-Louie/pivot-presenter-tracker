package io.pivotal.presenterpointtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Presentation {

    @Id
    long id;

    @NotNull
    String presentation;

    @OneToOne
    Pivot lastPresentedPivot;

    public Presentation() {
    }

    public Presentation(String presentation, Pivot lastPresentedPivot) {
        this.presentation = presentation;
        this.lastPresentedPivot = lastPresentedPivot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Pivot getLastPresentedPivot() {
        return lastPresentedPivot;
    }

    public void setLastPresentedPivot(Pivot lastPresentedPivot) {
        this.lastPresentedPivot = lastPresentedPivot;
    }
}
