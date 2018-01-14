package org.fasttrackit;

public class Animal {
    private String name;
    private String gender;
    public String favoriteFoodName;
    public String favoriteActivityName;
    public String happinessLevel;


    public int hungerLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteActivityName() {
        return favoriteActivityName;
    }

    public String getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(String happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setFavoriteActivityName(String favoriteActivityName) {
        this.favoriteActivityName = favoriteActivityName;


    }

}
