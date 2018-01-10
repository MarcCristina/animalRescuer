package org.fasttrackit;


import java.time.LocalDate;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Leo");
        dog.setAge(2.5);
        dog.setHealthCondition("healty");
        dog.setBreed("beagle");

        Cat cat = new Cat();
        cat.setColor("black");
        cat.setHight(20);
        cat.setWeight(4);
        cat.setRole("campionship");

        Rescuer rescuer = new Rescuer();
        rescuer.setName("Cristina");
        rescuer.setHomeType("apartment");
        rescuer.setMoney(600);

        Vet vet = new Vet();
        vet.setSpecialization("ClinicaAnimals");
        vet.setLocator("Cluj");
        vet.setDirections("center");
        vet.setName("Paula");

        ChipTrack chiptrack = new ChipTrack();
        chiptrack.setActivitys("walking");
        chiptrack.setPlaces("parks");

        Planner planer = new Planner();
        planer.setTodo("walk");
        planer.setAppoiments("doctor");
        planer.setEvents("birthday");

        DogFood dogFood = new DogFood();
        dogFood.setType("dry");
        dogFood.setBrand("pedigree");
        dogFood.setFlavor("chicken");
        dogFood.setPackaging("bag");
        dogFood.setPrice(100);
        dogFood.setQuantity(9.5);

        CatFood catFood = new CatFood();
        catFood.setName("Wiskas");
        catFood.setFlavor("fish");

        Training training = new Training();
        training.setCommand("sit");
        training.setSound("whistle");

        org.fasttrackit.Calendar calendar = new org.fasttrackit.Calendar();
        calendar.setActivityName("training");
        calendar.setDate(LocalDate.now());


        EntertaimentActivity run = new EntertaimentActivity();
        run.setName("running");

        rescuer.feed(dog, dogFood);
        rescuer.entertain(dog, run);

        rescuer.feed(cat, catFood);
        rescuer.behavior(cat, run);

        planer.celebrate(dog, dog);
        planer.celebrate(cat, cat);

    }
}