package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Rescuer rescuer;
    private Dog dog;
    private Animal animal;
    private DogFood dogFood;
    private Vet vet;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertaimentActivity[] availableActivities = new EntertaimentActivity[10];

    private String initRescuer() {
        System.out.println(" Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is:" + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");
            return initRescuer();
        }
        System.out.println("You entered name");
        return name;

    }

    private void nameAnimal() {
        System.out.println("Enter animal name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Animal name is: " + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");

        }
    }

    private void showavailableFood() {

        System.out.println("availableFood");
        for (Food food : availableFood) {
            System.out.println(food.getName());
        }
    }

    public void initAnimal() {
        Animal animal = new Animal();
        animal.setName("Leo");
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

        availableActivities[0] = acttivity;
        availableActivities[1] = activity1;
    }

    private void initrequireFeeding() {
        System.out.println("Feed animal");
        Scanner scanner = new Scanner(System.in);
        String getfood = scanner.nextLine();
        System.out.println("Your food is:" + getAvaibleFood());
        {
            try {
                getfood = scanner.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Please enter valid name");

                for (Food food : availableFood) ;
                if (availableFood != null) {
                    System.out.println("You could chose other type of food");
                }


            }
        }
    }


    public void start() {
        initFood();
        initActivities();
        showavailableFood();
        initAnimal();
        initAnimal();
        initrequireFeeding();

    for (int i =0; i < 10; i++){
        initrequireFeeding();
        initActivities();
        if (animal.happinessLevel <= 10){
            System.out.println("Congratulation your pet is the happiest");
            break;
        }
        if (animal.hungerLevel <= 10);{
            System.out.println("Congratulation your pet is not hungry");
            break;
        }
    }

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
