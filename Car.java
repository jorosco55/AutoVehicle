package com.company.automobile;

public class Car extends Vehicle {
    String interior;
    String accessories;

    public String toString() {
        String inter = super.toString();
        inter +="\nInterior: " + interior;
        String access = super.toString();
        access += "\nAccessories: " + accessories;
        return (inter + access);
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }
}


