package org.fasttrackit;

import java.time.LocalDate;

public class Calendar extends Planner {
    private String activityName;
    private LocalDate date;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}