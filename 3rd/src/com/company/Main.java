package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String[] arr = new String[]{"a", "b", "c"};
        String[] arr1 = new String[5];
        arr1[0] = "a";
        //<> sauc par generics (vispārināšana)
        ArrayList<String> arrlist = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>(); // reti izmanto
        ArrayList list2 = new ArrayList(); // lists pieņem, ka pievienotā vērtība ir objekts
        arrlist.add("a");
        arrlist.set(0, "brg");
        String izņemtais = arrlist.remove(0); // izņemtais tagad ir brg
        arrlist.remove("a");
        boolean vaiIzņemts = arrlist.remove("a");
        arrlist.get(0);
        int sarkstaGarums = arrlist.size();


        //sarakstu generikos iekšā iet tikai objekti, resp., String, Integer, Double, Boolean, Float, Char etc.*/

        //--------UZDEVUMS
        /*String input = "";
        ArrayList<String> list = new ArrayList<>();
        do {

            System.out.println("Ievadiet kko. Ja vēlaties iziet, rakstiet 'exit'");
            Scanner scr = new Scanner(System.in);
            input = scr.nextLine();
            list.add(input);
            //if(!list.contains(input)) {
            //    list.add(input);
            //}
        }
        while (!input.equals("exit"));

        list.remove("exit");
        //for(String elem : list) {
        //System.out.println(elem);
        //}

        //---HOW NOT TO DO THINGS
        //nokrešo, jo samazinām cikla izmēru ar remove

        //for (int i = 0; i < list.size(); i++) {
        // String e = list.get(i)
        //      for(int j = i+1; j < list.size(); j++) {
        //         if(e.equals(list.get(j))) {
        //          list.remove(list.get(j)) }}}
        //HOW NOT TO DO THINGS-----

        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);*/
        //------UZDEVUMS

        /*String month = "mēnesis";
        switch (month) {
            case "1":
                System.out.println("Janvāris");
                break;
            case "2":
                System.out.println("Februāris");
                break;
                default:
                    System.out.println("Nav tāda");
        }*/

        System.out.println("Ievadiet skaitli");
        Scanner scr = new Scanner(System.in);
        double number = scr.nextDouble();
        System.out.println("Ievadiet skaitli");
        double number2 = scr.nextDouble();
        System.out.println();
        scr.nextLine();

        System.out.println("Ievadiet darbību (+,-,*,/)");
        String a = scr.nextLine();

        switch (a) {
            case "+":
                System.out.println(add(number,number2));
                break;
            case "-":
                System.out.println(subtraction(number,number2));
                break;
            case "*":
                System.out.println(multiply(number,number2));
                break;
            case "/":
                if(number2 == 0) {
                    System.out.println("Dalījums ar nulli nav iespējams");
                } else {
                    System.out.println(divide(number,number2));
                }
                break;
            case "%":
                if(number2 == 0) {
                    System.out.println("Dalījums ar nulli nav iespējams");
                } else {
                    System.out.println(module(number,number2));
                }
                break;
            case "^":
                System.out.println(kapinasana(number,number2));
                break;
                case "hipot":
                System.out.println(triangle(number,number2));
                break;
            default:
                System.out.println("Nepareizi ievadīta darbība");
        }
    }
    static double add(double x, double y) {
        return x+y;
    }

    static double subtraction(double x, double y) {
        return x-y;
    }

    static double multiply(double x, double y) {
        return x*y;
    }

    static double divide(double x, double y) {
        return x/y;
    }

    static double module(double x, double y) {
        return x%y;
    }

    static double triangle(double x, double y){
        return Math.sqrt(x*x + y*y);

    }

    static double kapinasana(double x, double y) {
        double result = 1.0;
        for (int i = 1; i <= y; i++) {
            result*=x;
        }
        return result;
    }
}
