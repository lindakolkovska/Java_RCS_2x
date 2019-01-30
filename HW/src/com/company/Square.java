package com.company;

public class Square extends Rectangle{
    //mantošana ar apzīmejumu "extends"


    public Square (int margin) {
        super(margin, margin); //sanāk tipa Rectangle(int x, int y)
    }

    @Override
    public String toString() {
        return "Kvadrāts ar malas garumu: " + height; //izmantoju mainīgo no vecāku klases (Taisnstūris)
    }





}
