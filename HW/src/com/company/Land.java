package com.company;

public class Land implements hasPerAndArea {

    private double area1;
    private double perimeter1;

    public Land (int area1, int perimeter1) {
        this.area1 = area1;
        this.perimeter1 = perimeter1;
    }

    @Override
    public double area() {
        return area(); //šito paņem no inerfeisa - metodi;
    }

    @Override
    public double perimeter() {
        return perimeter(); //šito paņem no inerfeisa - metodi
    }

    public String toString() {
        return "Zemes gabals ar laukumu: " + area1 + " un perimetru: " + perimeter1;
    }

    public double getArea1() {
        return area1;
    }

    public void setArea1(double area1) {
        this.area1 = area1;
    }


}
