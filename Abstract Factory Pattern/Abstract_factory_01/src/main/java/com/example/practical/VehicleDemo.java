package com.example.practical;

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleFactory factory;
        // Simulating factory selection
        String vehicleType = "electric";
        if(vehicleType.equalsIgnoreCase("electric")) {
            factory = new ElectricVehicleFactory();
        } else {
            factory = new PetrolVehicleFactory();
        }
        // Creating vehicles using factory
        Car car = factory.createCar();
        Bike bike = factory.createBike();
        car.manufacture();
        bike.manufacture();
    }
}