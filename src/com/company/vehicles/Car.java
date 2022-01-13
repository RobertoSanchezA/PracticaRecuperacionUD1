package com.company.vehicles;

public class Car {
    private double maxSpeed;
    private int numOfWheels;
    private String fuelType;

    public Car(double maxSpeed, int numOfWheels, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.numOfWheels = numOfWheels;
        this.fuelType = fuelType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
