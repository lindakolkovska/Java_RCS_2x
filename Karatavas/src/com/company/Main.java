package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //masīvs, kas satur visus vārda burtus
        //sarakstu šajā konkrētā gadījumā nav jēga taisīt, to varētu darīt, ja vārds minamais vārds būtu mainīgs lielums
        String[] word = new String[]{"k", "a", "r", "ā", "t", "a","v", "a", "s"};
        //otrs masīvs, kura vērtības tiks mainītas, atkarībā no ievades, tādējādi parādot, kas ir un kas nav atminēts
        String[] guess = new String[word.length];

        //Sākuma teksts, kas tiek izdrukāts konsolē
        System.out.println("Spēle karātavas. Vārds sastāv no " + word.length + " butriem");
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == null) {
                guess[i] = " _";
            }
            //padod guess masīva vērtības " _", resp., uzsktāmi tukšumi
            System.out.print(guess[i]);
        }
        System.out.println();

        //skaitītājs, lai zinātu, cik reizes notikusi burtu minēšana (ievade)
        int counter = 0;
        //mainīgais - pārbaudei, vai ir ievadītais burts ir vārdā
        boolean doesContainLetter = false;
        //mainīgais - pārbaudei, vai ir palicis guess masīvā kāds tukšums
        boolean isEmpty = true;

        //kamēr minējumu skaits <= 10, tikmēr prasa ievadi
        while(counter <= 10) {
            System.out.println("Ievadiet burtu");
            Scanner scr = new Scanner(System.in);
            String input = scr.nextLine();

            //pārbauda, vai ievadītais burts ir atrodams
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(input)) {
                    //ja ir atrodams, šo ievadīto burtu ievieto guess masīva tajā pašā pozīcijā, kur tas atrodas word masīvā
                    guess[i] = input;
                    //lai pārbaudītu, vai nevajag paziņot, ka ievadītais burts neatrodas vārdā
                    doesContainLetter = true;
                }

                //ja guess masīvā ir pozīcija bez vērtībām, tās aizstāj ar uzskatāmiem tukšumiem
                if(guess[i] == null) {
                        guess[i] = " _";
                }
                System.out.print(guess[i]);
            }
            System.out.println();


            //ja burts netiek atrasts vārdā, izdrukā paziņojumu
            if (doesContainLetter == false) {
                System.out.println("Nav šāda burta");
            }

            //pārbaude, vai ir vēl palikuši tukšumi guess masīvā
            for(int i =0; i < guess.length; i++){
                if(guess[i].equals(" _")){
                    isEmpty = true;
                } else {
                    isEmpty = false;
                }
            }

            //ja visas guess masīva pozīcijas ir aizpildītas, izdrukā paziņojumu par atminēšanu
            if(isEmpty == false) {
                System.out.println("Vārds ir atminēts!");
                break;
            }

            //katru reizi, izejot cauri while ciklam, skaitītājs palielinās par 1
            counter = counter +1;

            //ja minējuma reizes pārsniedz 10, spēle beidzas
            if (counter > 10) {
                System.out.println("Izsmelts mēģinājumu skaits. Vārds nav atminēts.");
                break;
            }

            //atgriežu bool uz sākotnējo vērtību, lai varētu pārbaudīt nākamo burtu
            doesContainLetter = false;

        }
            //es pieļauju, ka šis nav pats skaistākais kods, kāds ir redzēts :) bet strādā
            //centos salauzt, man nesanāca
            //gan jau necentos pietiekami :D

            //ja ir kāds ieteikums vai komentārs, būšu pateicīga :)

    }
}
