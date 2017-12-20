package org.fasttrackit;

public class Rescuer {
    private String name;
    private double money;
    private String homeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }


    public void feed(Animal animal, DogFood dogFood) {
        System.out.println(this.name + "just gave some" + dogFood.getName() + "food to" + animal.getName());
    }

    public void entertain(Animal animal, EntertaimentActivity entertaimentActivity) {
        System.out.println(this.name + "just did some" + entertaimentActivity.getName() + "with" + animal.getName());
    }

    public void feed(Animal animal, CatFood catFood) {
        System.out.println(this.name + "just gave some" + CatFood.getName() + "food to" + animal.getName());}

    public void behavior(Animal animal, EntertaimentActivity entertaimentActivity) {
        System.out.println(this.name + "just did some" + entertaimentActivity.getName() + "hunt" + animal.getName());}



        }





