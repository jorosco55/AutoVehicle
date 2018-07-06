package com.company.automobile;

public class Vehicle {
    String make;
    String model;
    int year;
    String tires;
    String color;

    public Vehicle() {}

    public Vehicle(String myMake, String myModel, int myYear, String myTires, String myColor) {
        make = myMake;
        model = myModel;
        year = myYear;
        tires = myTires;
        color = myColor;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
