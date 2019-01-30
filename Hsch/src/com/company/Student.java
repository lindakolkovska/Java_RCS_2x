package com.company;

public class Student extends SchoolPpl {

    private int studentCardId;

    public Student (String name, String lastName, int studentCardId) {
        super(name, lastName);
        this.studentCardId = studentCardId;
    }

    public int getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(int studentCardId) {
        this.studentCardId = studentCardId;
    }




}
