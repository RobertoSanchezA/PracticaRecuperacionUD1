package com.company.vehicles;

public class Boat extends Vehicle {

    public static enum BoatType {
        FRIGATE, //fragata
        FREIGHTER, //carguero
        BOAT,
        SUBMARINE
    }

    private String name;
    private double length;
    private double width;



    public Boat(double maxSpeed, String enrollment, String color, String mark, String name, double length, double width) {
        super(maxSpeed, enrollment, color, mark);
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Boat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", maxSpeed=" + maxSpeed +
                ", enrollment='" + enrollment + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
