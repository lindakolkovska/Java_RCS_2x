package com.company;

public class Circle extends Shapes {
    //mantošana ar apzīmejumu "extends"

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override

    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Aplis ar rādiusu" + radius;
    }
}
