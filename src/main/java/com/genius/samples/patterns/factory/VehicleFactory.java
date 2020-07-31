package com.genius.samples.patterns.factory;

public class VehicleFactory {

    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();
        Vehicle v = (Vehicle)vf.createVehicle("car");

        if(v instanceof Car) {
            System.out.println("its a car class");
        }
    }

    public Vehicle createVehicle(String type) {
        if(type.equals("car")) {
            return new Car();
        }
        return null;
    }
}
