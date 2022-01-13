package com.company.vehicles;

public class Motorcycle {
    public static enum Gearbox {
        MANUAL,
        AUTOMATIC
    }

    private double maxSpeed;
    private String weight;
    private double displacement; //cilindrada
    private Gearbox gearbox;

    public Motorcycle(double maxSpeed, String weight, double displacement, Gearbox gearbox) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.displacement = displacement;
        this.gearbox = gearbox;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }


}
