package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course implements HasId<String>{

    private String courseName;
    private Professor professor;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
        //students = new ArrayList<>();
    }

    @Override
    public String getId1() {
        return getCourseName();
    }

    public void addStudents (Student student) {
        students.add(student);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String schoolName) {
        this.courseName = schoolName;
    }




}
