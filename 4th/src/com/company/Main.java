package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //KOLEKCIJU VEIDI JAVA
        //-saraksti
        //-maīvi
        //-map

        //1.
        /*Map<String, String> dictionary = new HashMap<>(); //kr.pusē var būt vispārīgāks tips; l.pusē - konkrētāku (P:List list = new ArrayList)
        dictionary.put("suns", "zīdītājs, četrkājains");
        String defintion = dictionary.get("suns");

        dictionary.put("suns", "siltasiņu dzīvnieks, zīdītājs");
        dictionary.remove("suns");

        dictionary.clear(); // visu iztīra

        dictionary.size();
        dictionary.keySet(); // dabū visas atslēgas;
        dictionary.containsKey("suns");

        dictionary.getOrDefault("suns", "nav tāda");*/ //parbauda, vai ir kāda konkrēta vērtība; ja nav, atgriež ierakstīto iekavās.


        //2. SET (nav garantēta vērtību secība) (vairāk kā 1x nevar ielikt vienādas vērtības)
        /*HashSet<String> kopa = new HashSet<>();
        kopa.add("a");
        kopa.remove("a");
        kopa.size();
        kopa.isEmpty();*/


        /*String input = "";
        HashSet<String> kopa = new HashSet<>();
        do {
            System.out.println("Ievadiet vārdu: ");
            Scanner scr = new Scanner(System.in);
            input = scr.nextLine();

            if(!input.equals("exit")) {
                kopa.add(input);
            }

        }
        while(!input.contains("exit"));

        for(String elem : kopa) {
            System.out.println(elem);
        }*/

         String term = "";
         String definition = "";
        Map<String, String> kopa = new HashMap<>();
        do {
            System.out.println("Ievadiet vārdu: ");
            Scanner scr = new Scanner(System.in);
            term = scr.nextLine();

            if(term.equals("exit")) {
                break;
            }
            System.out.println("Ievadiet skaidrojumu: ");
            definition = scr.nextLine();

            if(!kopa.containsKey(term)) {
              kopa.put(term, definition);
            }
        }
        while(true);

        System.out.println(kopa);
    }

}

