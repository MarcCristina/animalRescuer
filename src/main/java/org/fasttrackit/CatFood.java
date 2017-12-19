package org.fasttrackit;

public class CatFood extends Food {

    private static String Name;
    private static String Flaver;

    public CatFood() {
    }

    public static String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFlaver() {
        return Flaver;
    }

    public void setFlaver(String flaver) {
        Flaver = flaver;
    }
}
