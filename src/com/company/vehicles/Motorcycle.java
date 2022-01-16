package com.company.vehicles;

public class Motorcycle extends Vehicle{


    public static enum Gearbox {
        MANUAL,
        AUTOMATIC
    }

    private String weight;
    private double displacement; //cilindrada
    private Gearbox gearbox;

    public Motorcycle() {
        super();
    }

    public Motorcycle(double maxSpeed, String enrollment, String color, String mark, String weight, double displacement, Gearbox gearbox) {
        super(maxSpeed, enrollment, color, mark);
        this.weight = weight;
        this.displacement = displacement;
        this.gearbox = gearbox;
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

    @Override
    public String toString() {
        return "Motorcycle{" +
                "weight='" + weight + '\'' +
                ", displacement=" + displacement +
                ", gearbox=" + gearbox +
                ", maxSpeed=" + maxSpeed +
                ", enrollment='" + enrollment + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
