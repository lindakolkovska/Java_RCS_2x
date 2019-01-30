package com.company;

public class Student extends SchoolPpl implements HasId<Integer>{

    private int idNumber;

    public Student (String name, String lastName, int idNumber) {
        super(name, lastName);
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public Integer getId1() {
        return getIdNumber();
    }
}
