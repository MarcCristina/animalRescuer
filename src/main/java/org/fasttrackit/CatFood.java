package org.fasttrackit;

public class CatFood extends Food {

    private static String Name;
    private static String Flavor;
    private double money;

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getFlavor() {
        return Flavor;
    }

    public static void setFlavor(String flavor) {
        Flavor = Flavor;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
    }
}
