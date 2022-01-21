package com.company.vehicles;

import java.util.Arrays;

public class Car extends Vehicle{

    private int numOfWheels;
    private String fuelType;

    private final String[] fuelTypes = {
            "GASOLINA98",
            "GASOLINA95",
            "DIESEL"
    };

    public Car(double maxSpeed, String enrollment, String color, String mark, int numOfWheels, String fuelType) {
        super(maxSpeed, enrollment, color, mark);
        this.numOfWheels = numOfWheels;
        this.fuelType = fuelType;
    }

    public Car() {
        super();
        this.numOfWheels = generateRandomNumOfWheels();
        this.fuelType = generateRandomFuelType();
    }


    public int generateRandomNumOfWheels(){
        if (Math.random()< 0.5) return 3;
        else return 4;
    }

    public String generateRandomFuelType(){
        return fuelTypes[(int)(Math.random() * fuelTypes.length)];
    }

    @Override
    public String toString() {
        return "Car \n" +
                "numero de Ruedas= " + numOfWheels + "\n" +
                "Carburante= '" + fuelType + "\n" +
                super.toString() +
                "\n";
    }
}
