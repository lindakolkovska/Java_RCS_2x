package com.company;

import java.io.*;
import java.lang.management.BufferPoolMXBean;

public class Main {

    public static void main(String[] args) {

        /*int x = 8;
        int y = 0;
        int z;

        try{
            z = x/y;
            throw  new ArithmeticException();

        } catch (ArithmeticException e) {
            System.out.println("Nu, šitā jau nu nevar");
            z = -1;
            //throw e =  try-catch apakšlīmenis pasaka, lai to kļūdu risina try-catch virslīmenis
        } catch (Exception e) {
            System.out.println("Cita kļūda");
        } finally {
            //izpildas šis kods, vienlga ir kļūda vai nav
            System.out.println("finally");
        }

        System.out.println("A tālāk arī printē :P");
        //aritmetic exception
        //nullPointerException - ja mainīgajam vērtība ir null, bet mēs tipa kko darām ar to;*/

        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter writer = new BufferedWriter(fw); //klase, kas vieglāk ļauj izmantot fileWriter'i
            writer.write("Pirmā rinda");
            writer.newLine();
            writer.write("Otrā rinda");


            writer.close();

        } catch (IOException e) {
            System.out.println("Kļūda");
        }


        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while(line!=null) {
                //System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nav atrasts fails");
        } catch (IOException e) {
            System.out.println("IO kļūda");
        }

        //
        try {
            FileWriter fw = new FileWriter("data1.txt");
            BufferedWriter writer = new BufferedWriter(fw); //klase, kas vieglāk ļauj izmantot fileWriter'i

            String rinda = "rinda";
            for (int i = 1; i < 1001; i++) {
                writer.write(rinda +" "+ i);
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Kļūda");
        }


        /*try {
            FileReader fr = new FileReader("data1.txt");
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while(line!=null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nav atrasts fails");
        } catch (IOException e) {
            System.out.println("IO kļūda");
        }*/


        try{
            FileReader fr = new FileReader("data1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while(line!=null) {
                if(line.contains("3")) {
                    System.out.println(line);
                }
                line = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nav atrasts fails");
        } catch (IOException e) {
            System.out.println("IO kļūda");
        }
    }

    /*public void myMethod() throws NullPointerException {

    }*/

}
