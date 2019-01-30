package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            ArrayList<Professor> professors = new ArrayList<>();
            ArrayList<Student> students = new ArrayList<>();
            ArrayList<Course> courses = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            boolean exit = false;

            do{
                System.out.println("Izvēlieties darbību\n" +
                        "\tP - pievienot pasniedzēju;\n"+
                        "\tS - pievienot studentu;\n"+
                        "\tK - pievienot kursu\n" +
                        "\tMS - meklēt studentu\n"+
                        "\tMP - meklēt pasniedzēju\n"+
                        "\tMK - meklēt kursu\n"+
                        "\tDZP - dzēst pasniedzēju\n"+
                        "\tDZS - dzēst pasniedzēju\n"+
                        "\tE - iziet");
                String input = sc.nextLine();
                String choice = input.toUpperCase();

                switch (choice) {
                    case "P": {
                        System.out.println("Ievadiet pasniedzēja vārdu:");
                        String input1 = sc.nextLine();
                        String professorName = input1.substring(0,1).toUpperCase()+input1.substring(1).toLowerCase();

                        System.out.println("Ievadiet pasniedzēja uzvārdu:");
                        String input2 = sc.nextLine();
                        String professorLastName = input2.substring(0,1).toUpperCase()+input1.substring(1).toLowerCase();

                        System.out.println("Ievadiet pasniedzēja id numuru:");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Professor newProfessor = new Professor(professorName, professorLastName, id);
                        professors.add(newProfessor);

                        break;
                    }
                    case "S": {
                        System.out.println("Ievadiet studenta vārdu:");
                        String input1 = sc.nextLine();
                        String studentName = input1.substring(0,1).toUpperCase()+input1.substring(1).toLowerCase();

                        System.out.println("Ievadiet studenta uzvārdu:");
                        String input2 = sc.nextLine();
                        String studentLastName = input2.substring(0,1).toUpperCase()+input1.substring(1).toLowerCase();

                        System.out.println("Ievadiet studenta id numuru:");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Student newStudent = new Student(studentName,studentLastName,id);
                        students.add(newStudent);

                        break;
                    }
                    case "K": {
                        System.out.println("Ievadiet kursa nosaukumu");
                        String inp = sc.nextLine();
                        String courseName = inp.substring(0,1).toUpperCase()+inp.substring(1).toLowerCase();

                        System.out.println("Izvēlēties kursa pasniedzēju pēc id numura");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Professor theProfessor = searchId(professors, id);
                        if(theProfessor == null) {
                            System.out.println("Pasniedzējs nav atrasts");
                        } else {
                            Course newCourse = new Course(courseName, theProfessor);
                            courses.add(newCourse);
                        }

                        for (Course c : courses) {
                            System.out.println(c.getCourseName());
                        }

                        break;
                    }
                    case "MS": {

                        System.out.println("Ievadiet studenta id numuru");
                        int idNr = sc.nextInt();
                        sc.nextLine();

                        /*Student foundStudent = searchId(students, idNr);

                        if(foundStudent == null) {
                            System.out.println("Pasniedzējs nav atrasts");
                        } else {
                            System.out.println(foundStudent.getName() + foundStudent.getLastName());
                        }*/

                        String answer = "Students nav atrasts";

                        for (Student stud : students) {
                            if(idNr == stud.getIdNumber()){
                                answer = stud.getName()+" " +stud.getLastName();
                            }
                        }
                        System.out.println(answer);

                        break;
                    }
                    case "MP": {
                        System.out.println("Ievadiet pasniedzēja id numuru");
                        int idNr = sc.nextInt();
                        sc.nextLine();

                        Professor foundProfessor = searchProfessor(professors, idNr);

                        Professor foundProfessor1 = searchId(professors, idNr);

                        if(foundProfessor1 == null) {
                            System.out.println("Pasniedzējs nav atrasts");
                        } else {
                            System.out.println(foundProfessor1.getName() + foundProfessor1.getLastName());
                        }



                        /*String answer = "Students nav atrasts";

                        for (Professor prof : professors) {
                            if(idNr == prof.getId()){
                                answer = prof.getName()+" " +prof.getLastName();
                            }
                        }
                        System.out.println(answer);*/
                        break;
                    }
                    case "MK" : {
                        System.out.println("Ievadiet kursa nosaukumu");
                        String inp = sc.nextLine();
                        String searchCourse = inp.substring(0,1).toUpperCase()+inp.substring(1).toLowerCase();

                        Course theCourse = searchId(courses, searchCourse);

                        System.out.println(theCourse.getCourseName());

                        if(theCourse == null) {
                            System.out.println("Kurss nav atrasts");
                        } else {
                            System.out.println(theCourse.getCourseName());
                        }

                        break;
                    }
                    case "E": {
                        exit = true;
                        break;
                    }
                    case "DZP": {
                        System.out.println("Norādiet, kuru pasniedzēju izdzēst (pēc id numura):");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Professor deleteProfessor = searchProfessor(professors, id);

                        if(deleteProfessor == null) {
                            System.out.println("Nav šāda pasniedzēja");
                        } else {
                            professors.remove(deleteProfessor);
                            System.out.println("Pasniedzējs ar id Nr." + id + "izdzēsts");
                        }
                        break;
                    }
                    case "DZS": {
                        System.out.println("Norādiet, kuru studentu izdzēst (pēc id numura):");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Student deleteStudent = searchId(students, id);

                        if(deleteStudent == null) {
                            System.out.println("Nav šāda pasniedzēja");
                        } else {
                            professors.remove(deleteStudent);
                            System.out.println("Pasniedzējs ar id Nr." + id + "izdzēsts");
                        }
                        break;
                    }
                    default:{
                        System.out.println("Nepareiza ievade.");
                    }
                }

            }
            while (exit == false);
    }

    private static <T extends HasId<U>, U> T searchId (ArrayList<T> saraksts, U id) {
            //T ir brīvas izvēles datu tips, kas var būt tikai tāds, kādi ir nodefinēti klasēs
            //kurām ir pievienots interfeiss HasId
        //principā, ja nepiesaistītu T pie HasId, tad tas izskatītos - <T,U>

        for (T ppl : saraksts) {
            if(id.equals(ppl.getId1())) {
                return ppl;
            }
        }
        return null;
    }

    private static Professor searchProfessor (ArrayList<Professor> professors, int professorId) {

        for (Professor prof : professors) {
            if(professorId == prof.getId()) {
                return prof;
            }
        }
            return null;
    }
}
