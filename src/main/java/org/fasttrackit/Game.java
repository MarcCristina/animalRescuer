package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Rescuer rescuer;
    private Dog dog;
    private DogFood dogFood;
    private Vet vet;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertaimentActivity[] availableActivities = new EntertaimentActivity[10];
    private void showavailableFood (){

        System.out.println("availableFood");

        for (Food food: availableFood){
            System.out.println(food.getName());
        }
    }

    private void initFood() {
        Food food = new Food();
        food.setName("Akana");

        Food food1 = new Food();
        food.setFood("Royal");

        availableFood.add(food);
        availableFood.add(food);

    }

    private void initActivities() {
        EntertaimentActivity acttivity = new EntertaimentActivity();
        acttivity.setName("Run");

        EntertaimentActivity activity1 = new EntertaimentActivity();
        activity1.setName("hunting");

        availableActivities[0]=acttivity;
        availableActivities[1]=activity1;
    }

    public  void start(){
        initFood();
        initActivities();
        showavailableFood();

    }

    public List<Food> getAvaibleFood() {
        return availableFood;
    }

    public void setAvaibleFood(List<Food> avaibleFood) {
        this.availableFood = avaibleFood;
    }

    public EntertaimentActivity[] getAvaibleActivities() {
        return availableActivities;
    }

    public void setAvaibleActivities(EntertaimentActivity[] avaibleActivities) {
        this.availableActivities = avaibleActivities;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public DogFood getDogFood() {
        return dogFood;
    }

    public void setDogFood(DogFood dogFood) {
        this.dogFood = dogFood;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
