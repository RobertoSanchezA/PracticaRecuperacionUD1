package com.company.vehicles;

public class Motorcycle extends Vehicle{

    private double weight;
    private int displacement; //cilindrada

    public Motorcycle() {
        super();
        this.weight = generateRandomWeight();
        this.displacement = generateRandomDisplacement();

    }

    public Motorcycle(double maxSpeed, String enrollment, String color, String mark, double weight, int displacement) {
        super(maxSpeed, enrollment, color, mark);
        this.weight = weight;
        this.displacement = displacement;
    }

    public double generateRandomWeight(){
        return Math.random() * 350;
    }

    public int generateRandomDisplacement(){
        return (int)(Math.random() * 3000);
    }

    @Override
    public String toString() {
        return "Motorcycle" + "\n" +
                "Peso= " + (String.format("%.2f", weight)) + "\n" +
                "Cilindrada= " + displacement + "\n" +
                super.toString();
    }
}
