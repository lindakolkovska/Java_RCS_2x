package com.company;

import java.awt.*;

public class Animal {

    //klases mainīgie (member valuables)
    private final String species;
    private int legs;
    private Color color;
    private boolean flying;
    private String sound;
    public final boolean alive=true;


    //konstruktors
    public Animal(String species, int legs, Color color, boolean flying, String sound) {
        this.species = species;
        this.legs = legs;
        this.color = color;
        this.flying = flying;
        this.sound = sound;
    }

    //konstruktors
    public Animal() {
        species = "Nezināms";
    }

    //metodes
    public String getSpecies() {
        return species;
    }




    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean getFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

   public void speak () {
       System.out.println(sound);
   }

    public static void whoAreYou() {
        System.out.println("I am an animal");
    }
}
