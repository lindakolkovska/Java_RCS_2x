package com.company;

public class Triangle extends Shapes {
    //mantošana ar apzīmejumu "extends"

    private int margin1;
    private int margin2;
    private int margin3;

    //private int perimeter;

    public Triangle(int margin1, int margin2, int margin3) {
        this.margin1 = margin1;
        this.margin2 = margin2;
        this.margin3 = margin3;
    }

    @Override
    public double perimeter() {
        return margin1+margin2+margin3;
    }

    @Override
    public double area() {
        double pp = perimeter()/2.0;
        //System.out.println(pp);
        double area = Math.sqrt(pp*(pp-margin1)*(pp - margin2)*(pp-margin3));
        return area;
    }

    @Override
    public String toString(){
        return "Trijstūris ar malu garumiem: " + margin1 +", "+ margin2+ ", " + margin3;
    }

    public int getMargin1() {
        return margin1;
    }

    public void setMargin1(int margin) {
        this.margin1 = margin;
    }

    public int getMargin2() {
        return margin2;
    }

    public void setMargin2(int margin) {
        this.margin2 = margin;
    }

    public int getMargin3() {
        return margin3;
    }

    public void setMargin3(int margin) {
        this.margin3 = margin;
    }



}
