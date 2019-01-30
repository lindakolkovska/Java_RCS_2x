package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //Box/*<Integer>*/ kaste = new Box();

        /*Box<String> kaste = new Box<>();
        kaste.setContent("Kastes saturs");

        Box<Integer> intKaste = new Box<>();
        intKaste.setContent(//new Integer(5)// 5);*/

        //Pair<String, Integer> pāris = new Pair<>();

        /*Box<Integer> kaste = new Box<>();

        ArrayList<String> strList = new ArrayList<>();
        String newElement = "elllll";

        strList = addToList(strList, newElement);

        ArrayList<Integer> intList1 = new ArrayList<>();
        Integer newElement1 = 45;

        intList1 = addToList(intList1, newElement1);*/

        ArrayList<String> strSaraksts = new ArrayList<>();
        strSaraksts.add("a");
        strSaraksts.add("b");
        strSaraksts.add("c");

        System.out.println(findIndex(strSaraksts, "b"));
        System.out.println(findIndex(strSaraksts, "c"));
    }

    private static <T>ArrayList<T> addToList(ArrayList<T> list, T elements) {
        list.add(elements);
        return list;
    }

    private static int findIndex(ArrayList<String> saraksts, String elements) {
        return saraksts.indexOf(elements);
    }

    private static <T> int findIndexOf(ArrayList<T> saraksts, T elements) {
        return saraksts.indexOf(elements);
    }

    //[piekļuves līmenis - private, public etc]
    // static vai final (final - bērnu klase nevar overridot) piekļuves atslēgas vārds
    // [<placeholder datu tips> - vnk tā nosaukums]
    //return tips - ko dodam ārā (nav jāsakrīt ar placeholderi)
    //metodes nosaukums
    //([parametra tips, paramtera nosaukums]) tips var būt un var nebūt kā placeholders


}
