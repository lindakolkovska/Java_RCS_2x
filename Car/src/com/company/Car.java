package com.company;

public class Car {

    private String carLabel;
    private String carModel;
    private int year;

    public Car (String carLabel, String carModel, int year) {
        this.carLabel = carLabel;
        this.carModel = carModel;
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


    public String getCarLabel() {
        return carLabel;
    }

    public void setCarLabel(String carLabel) {
        this.carLabel = carLabel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




}
