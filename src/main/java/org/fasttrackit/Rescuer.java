package org.fasttrackit;

public class Rescuer {

    private String name;
    private double money;
    private String homeType;
    private String foodType;

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

    public void entertain(Animal animal, EntertaimentActivity entertaimentActivity) {
        System.out.println(this.name + "just did some" + entertaimentActivity.getName() + "with" + animal.getName());

    }

    public void pay(Food food) {
        this.money -= food.getPrice();

    }

    public void feed(Animal animal, Food food) {
        System.out.println((this.name + "just gave some" + food.getName() + "food to" + animal.getName()));
        animal.hungerLevel--;
        if (animal.favoriteFoodName.equals(food.name)) {
            animal.hapinessLevel++;
        }
    }
}







