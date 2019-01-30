package com.company;

public class Lecturer extends SchoolPpl {

    private int idNumber;


    public Lecturer (String name, String lastName, int idNumber) {
        super(name, lastName);
        this.idNumber=idNumber;
    }


    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }



    /*public String toString() {
        return
    }*/
}
