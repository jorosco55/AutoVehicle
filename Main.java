package com.company.automobile;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Potiac");
        car.setModel("GTO");
        car.setYear(1968);
        car.setColor("red");
        car.setInterior("leather");
        car.setTires("radial steel belted");
        car.setAccessories("SuperSport");

        System.out.println("I just bought a custom " + car.getColor() + " " + car.getYear() + " " + car.getMake()+ " " + car.getModel()+ " " + car.getAccessories() + " with " + car.getInterior()+ " seats and " + car.getTires() +  " tires.");


        Car car2 = new Car();
        car2.setMake("Ford");
        car2.setModel("Mustang");
        car2.setYear(1969);
        car2.setColor("red");
        car2.setInterior("leather");
        car2.setTires("radial steel belted");
        car2.setAccessories("SuperSport");

        System.out.println("I just bought a custom " + car2.getColor() + " " + car2.getYear() + " " + car2.getMake()+ " " + car2.getModel()+ " " + car2.getAccessories() + " with " + car2.getInterior()+ " seats and " + car2.getTires() +  " tires.");


        Truck truck1 = new Truck();
        truck1.setMake("Chevy");
        truck1.setModel("pickup");
        truck1.setYear(1956);
        truck1.setColor("black");
        truck1.setTires("daytons");
        truck1.setHitch("1/2 inch hitch");
        truck1.setLifts("2 inch lift");

        System.out.println("I am buying a " + truck1.getColor() + " " + truck1.getYear()+ " " + truck1.getMake() + " " + truck1.getModel() + " that comes with " + truck1.getTires()+ ", " + truck1.getHitch()+ ", and a " + truck1.getLifts() + ".");

    }
}
