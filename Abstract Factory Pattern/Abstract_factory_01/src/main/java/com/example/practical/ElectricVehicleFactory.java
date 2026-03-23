package com.example.practical;

class ElectricVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new ElectricCar();
    }
    public Bike createBike() {
        return new ElectricBike();
    }
}
