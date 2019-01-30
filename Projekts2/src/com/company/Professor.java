package com.company;

public class Professor extends SchoolPpl implements HasId<Integer>{

    private int id;

    public Professor (String name, String lastName, int id) {
        super(name, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public Integer getId1() {
        return getId();
    }
}
