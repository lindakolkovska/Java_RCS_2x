package com.company;

public abstract class Shapes implements hasPerAndArea{ //interfeisa metodes pievienot caur "implement" aiz vecāku klases;
    //interfeisus vau pievienot vairākus;

    private String color = "green"; //pēc noklusējuma visiem ir zaļa krāsa
    //bērnu klasēm obligāti jāizmanto augstāk minētās mainīgās metodes;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
