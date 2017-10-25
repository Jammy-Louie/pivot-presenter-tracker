package io.pivotal.presenterpointtracker.model;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@JsonSerializableSchema
public class Pivot {

    @Id
    long userId;

    @NotNull
    String userName;

    long score = 0;

    public Pivot() {
    }

    public Pivot(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
