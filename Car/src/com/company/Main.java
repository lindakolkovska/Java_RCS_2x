package com.company;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        try{
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while(line!=null) {
                String[] readCars = line.split(" ");

                int readYear = Integer.parseInt(readCars[2]);
                System.out.println(readYear);
                Car car = new Car (readCars[0], readCars[1], readYear);
                cars.add(car);

                /*for (String elem : readCars) {
                    System.out.println(elem);
                }*/
                //System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("IO kļūda");
        }

        for (Car elem : cars) {
            System.out.println(elem.getCarLabel() + " " + elem.getCarModel() + " " + elem.getYear());
        }
    }


}
