package com.company;

import javafx.animation.ScaleTransitionBuilder;

public class Rectangle extends Shapes {
    //mantošana ar apzīmejumu "extends"

    protected int height;
    protected int width;



    public Rectangle(int height, int width) {
        super();
        this.height = height;
        this.width = width;
        //tā kā metode color ir private, tad jamaina vērtība caur getColor
        setColor("Yellow");
    }

    @Override
    public double area () {
        return width * height;
    }

    @Override
    public double perimeter() {
        return height*2 + width*2;
    }

    @Override
    public String toString(){
        return "Taisnstūris ar malu garumu: " + height + ", " + width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }





}
