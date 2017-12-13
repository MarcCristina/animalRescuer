package org.fasttrackit;

import java.time.LocalDate;

public class Calendar extends Planner {

    private String ActivityName;
    private LocalDate date;

    public String getActivityName() {
        return ActivityName;

    }

    public void setActivityName(String activityName) { this.ActivityName = activityName;}
    }

    public LocalDate getDate() { return date; }

    public void setDate( LocalDate date ) {
        this.date = date;
    }
}
