package com.company;

public class SchoolPpl {
    private String name;
    private String lastName;
    private int id;


    public SchoolPpl(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return name + " " + lastName ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
