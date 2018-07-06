package com.company.automobile;

public class Truck extends Vehicle {
    String lifts;
    String hitch;

    public String toString() {
        String lyft = super.toString();
        lyft +="lifts: " + lifts;
        String hit = super.toString();
        hit +="hitch: " + hitch;
        return (lyft + hit);
    }

    public String getLifts() {
        return lifts;
    }

    public void setLifts(String lifts) {
        this.lifts = lifts;
    }

    public String getHitch() {
        return hitch;
    }

    public void setHitch(String hitch) {
        this.hitch = hitch;
    }
}
