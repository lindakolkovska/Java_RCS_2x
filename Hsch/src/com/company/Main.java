package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //private static final String PIEVIENOT_PASNIEDZĒJU = "pievienot pasniedzēju";


    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("John", "doe", 123);
        Course kurss = new Course("kko vada", lecturer1);

        //pievienot pasniedzēju
            //case -> nolasa v un uzv. un izveido jaunu pasniedzēju.

        //System.out.println(lecturer1);



        //pievienot pasniedzēju - add teacher
        //pievienot studentu - add student
        //pievienot kursu - add course

        Scanner scanner = new Scanner(System.in);
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        boolean iziet = true;

        do {
            System.out.println(
                    "Ierakstiet vēlamo darbību\n" +
                            "\tP (pievienot pasniedzēju)\n"+
                            "\tS (pievienot studentu)\n"+
                            "\tMP (meklēt pasniedzēju)\n"+
                            "\tMS (meklēt studentu)\n"+
                            "\tE (iziet)\n"

            );

            String input = scanner.nextLine();
            String inputToUpperCases = input.toUpperCase();

                switch (inputToUpperCases) {
                    case "P": {
                        /*System.out.println("Ievadiet pasniedzēja vārdu: ");
                        input = scanner.nextLine();
                        String lecturerName = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

                        System.out.println("Ievadiet pasniedzēja uzvārdu: ");
                        input = scanner.nextLine();
                        String lecturerLastName = input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();

                        System.out.println("Ievadiet pasniedzēja ID numuru: ");
                        int id = scanner.nextInt();
                       scanner.nextLine();*/


                        Lecturer lecturer2 = new Lecturer();
                        lecturers.add(lecturer2);

                        break;
                    }

                    case "S": {
                        System.out.println("Ievadiet studenta vārdu: ");
                        input = scanner.nextLine();
                        String studentName = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

                        System.out.println("Ievadiet studenta uzvārdu: ");
                        input = scanner.nextLine();
                        String studentLastName = input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();

                        System.out.println("Ievadiet studenta ID numuru: ");
                        int id2 = scanner.nextInt();
                        scanner.nextLine();

                        Student student2 = new Student(studentName, studentLastName, id2);
                        students.add(student2);

                        break;
                    }

                    case "E": {
                        iziet = false;
                        break;
                    }
                    case "MP": {
                        System.out.println("Ievadiet pasniedzēja ID numuru");
                        int inputId = scanner.nextInt();
                        scanner.nextLine();

                        String found = "Pasniedzējs nav atrasts";
                        for(Lecturer lec : lecturers) {
                            if(lec.getIdNumber() == inputId){
                                found = lec.getName()+" " +lec.getLastName();
                                break;
                            }
                        }
                        System.out.println(found);

                        break;
                    }
                    case "MS": {
                        System.out.println("Ievadiet studenta ID numuru");
                        int inputId = scanner.nextInt();
                        scanner.nextLine();

                        String found = "Students nav atrasts";
                        for (Student stud : students) {
                            if (stud.getStudentCardId() == inputId) {
                               found = stud.getName() + " " + stud.getLastName();
                                break;
                            }
                        }
                        System.out.println(found);
                        break;
                    }
                    default: {
                        System.out.println("Kļūda izvēles ievadē.");
                    }

                    }
                }
        while(iziet==true);

        if(!lecturers.isEmpty()){
            System.out.println("Pasniedzēju saraksts");
            for (Lecturer lec : lecturers) {
                System.out.println("Pasniedzēja vārds un uzvārds: " +
                        lec.getName()+ " " +lec.getLastName()+", id nr. " + lec.getIdNumber());
            }
        }

        if(!students.isEmpty()){
            System.out.println("Studentu saraksts");
            for (Student stud : students) {
                System.out.println("Studenta vārds un uzvārds: " +
                        stud.getName()+ " " +stud.getLastName()+", id nr. " + stud.getStudentCardId());
            }
        }



    }



    private SchoolPpl searchingSchoolPpl(ArrayList<SchoolPpl> people, int id ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet  ID numuru");
        int inputId = scanner.nextInt();
        scanner.nextLine();

        people = new ArrayList<>();


        String found = "Nav atrasts";
        for(SchoolPpl ppl : people) {
            if(ppl.getId() == inputId){
                found = ppl.getName()+" " +ppl.getLastName();
                break;
            }
        }
        System.out.println(found);

    }
}
