package com.company.vehicles;

public class Car extends Vehicle{

    private int numOfWheels;
    private String fuelType;

    public Car(double maxSpeed, String enrollment, String color, String mark, int numOfWheels, String fuelType) {
        super(maxSpeed, enrollment, color, mark);
        this.numOfWheels = numOfWheels;
        this.fuelType = fuelType;
    }

    public Car() {
        super();
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

    @Override
    public String toString() {
        return "Car{" +
                "numOfWheels=" + numOfWheels +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", enrollment='" + enrollment + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
