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

    private final String [] boatNames = {
            "Aguamarina",
            "Alba",
            "Calypso",
            "La Perla Negra",
            "Simon Peel",
            "Ultramar",
            "Zafiro",
            "Java",
            "Canterbury",
            "Rosinante",
            "Pelicano",
            "Adventure",
            "Fortune",
            "Al Borany",
            "Ranger",
            "Fancy"
    };

    public Boat(double maxSpeed, String enrollment, String color, String mark, String name, double length, double width) {
        super(maxSpeed, enrollment, color, mark);
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Boat() {
        super();
        this.name = generateRandomName();
        this.length = generateRandomLength();
        this.width = generateRandomWidth();
    }

    public String generateRandomName(){
        return boatNames[(int)(Math.random()* boatNames.length)];
    }

    public double generateRandomLength(){
        return Math.random() * 300;
    }

    public double generateRandomWidth(){
        return (Math.random() + 1000) * 5000;
    }

    @Override
    public String toString() {
        return "Boat" +
                "nombre = '" + name + "\n" +
                "Eslora= " + (String.format("%.2f", length)) + "\n" +
                "Manga= " + (String.format("%.2f", width)) +"\n" +
                super.toString();
    }
}
