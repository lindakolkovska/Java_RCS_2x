package com.company;

import java.util.ArrayList;

public class Course {

    private String kursaNosaukums;
    private Lecturer pasniedzējs;
    private ArrayList<Student> studenti = new ArrayList<>();

    public Course (String kursaNosaukums, Lecturer pasniedzējs) {
        this.kursaNosaukums=kursaNosaukums;
        this.pasniedzējs = pasniedzējs;
        //studenti = new ArrayList<>();
    }

    public void addStudent (Student students) {
        studenti.add(students);
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public String getKursaNosaukums() {
        return kursaNosaukums;
    }

    public void setKursaNosaukums(String kursaNosaukums) {
        this.kursaNosaukums = kursaNosaukums;
    }

    public Lecturer getPasniedzējs() {
        return pasniedzējs;
    }

    public void setPasniedzējs(Lecturer pasniedzējs) {
        this.pasniedzējs = pasniedzējs;
    }




}
