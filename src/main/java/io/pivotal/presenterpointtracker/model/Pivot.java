package io.pivotal.presenterpointtracker.model;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@JsonSerializableSchema
public class Pivot {

    @Id
    long id;

    @NotNull
    String userName;



    long score = 0;

    public Pivot() {
    }

    public Pivot(long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
