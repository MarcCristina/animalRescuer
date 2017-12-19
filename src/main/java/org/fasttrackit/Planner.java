package org.fasttrackit;

import static java.lang.System.*;

public class Planner {
    private String todo;
    private String appoiments;
    private String events;


    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getAppoiments() {
        return appoiments;
    }

    public void setAppoiments(String appoiments) {
        this.appoiments = appoiments;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public void celebrate(Animal animal, Dog dog) {
        System.out.println(this.events + "just celebrated" + dog.getAge() + "age" + animal.getName());}

    public void celebrate(Animal animal, Cat cat) {
        System.out.println(this.events + "just celebrated" + cat.getAge() + "age" + animal.getName());
    }
}