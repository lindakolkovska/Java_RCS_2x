package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main /*extens*/{

    public static void main(String[] args) {
	    /*Animal animal = new Animal("fox", 4, Color.orange, false, "kkk"); // šie ir objekti
	    Animal animal1 = new Animal("wolf", 4,Color.gray, false, "auuu");
	    Animal animal2 = new Animal("butterfly", 6, Color.yellow, true, "tap");


        System.out.println(animal1.getSpecies()+ ", legs: " +animal1.getLegs()+
                ", color: " +animal1.getColor()+", can it fly: " +animal1.getFlying());

        Animal.whoAreYou();
        //animal.alive=false; // tā nevar, jo klasē pie alive ir final nosacījums;*/

        //klase Shape - area(), perimeter()
            //taisnstūris
                //kvadrāts

            //trijstūris
            //aplis

        /*Rectangle taisnstūris = new Rectangle(5,6);
        Square kvadrāts = new Square(7);

        System.out.println("Taisnstūris un kvadrāts");
        System.out.println(taisnstūris.area());
        System.out.println(kvadrāts.area());
        System.out.println(taisnstūris.perimeter());
        System.out.println(kvadrāts.perimeter());
        System.out.println();

        Triangle trijstūris = new Triangle(4,5,6);

        System.out.println("Trijstūris: ");
        System.out.println(trijstūris.perimeter());
        System.out.println(trijstūris.area());

        Circle aplis = new Circle(5);

        System.out.println();
        System.out.println("Aplis: ");
        System.out.println("Perimetrs: " + aplis.perimeter());
        System.out.println("Laukums: "+ aplis.area());*/

        //POLIMORFISMS

        //atvasinātās (bērnu) klases var attiekties vecāku parametri;

        /*Shapes k = new Square(5);
        k.area();
        k.perimeter();
        Shapes a = new Circle(5); // utt.
        a.area();
        a.perimeter();*/

        ArrayList<Shapes> shape = new ArrayList<>();
        //ArrayList<hasPerAndArea> pUnL = new ArrayList<>(); -
        shape.add(new Square(5));
        shape.add(new Rectangle(8,9));
        shape.add(new Triangle(7,8,9));
        shape.add(new Circle(9));

        /*for (int i = 0; i < shape.size(); i++) {
            // mainīgo raksta - Shape s = shape.get(i);
            System.out.println("Laukums: " + shape.get(i).area());
            System.out.println("Perimetrs: " + shape.get(i).perimeter());
            System.out.println(shape.get(i)); // apļa klasē ir metode toString, tāpēc var vnk shape.get(i);
        }*/

        /*for (int i = 0; i < shape.size(); i++) {
            System.out.println(shape.get(i)); // apļa klasē ir metode toString, tāpēc var vnk shape.get(i);
            System.out.println("Krāsa ir: " +shape.get(i).getColor());

            System.out.println("Laukums: " + shape.get(i).area());
            System.out.println("Perimetrs: " + shape.get(i).perimeter());
            System.out.println();
        }*/

        Land land = new Land(25,20);
        ArrayList<hasPerAndArea> bla = new ArrayList<>();
        bla.add(new Square(5));
        bla.add(new Rectangle(8,9));
        bla.add(new Triangle(7,8,9));
        bla.add(new Circle(9));
        bla.add(new Land(25,20));
        System.out.println(land);
    }
}
