package com.company.vehicles;

import java.util.Arrays;

public class Vehicle {

    protected double maxSpeed;
    protected String enrollment; //matricula
    protected String color;
    protected String mark;
    private final String [] marks = {
            "Seat",
            "Bugatti",
            "Toyota",
            "Mitsubishi",
            "Suzuki",
            "Citroen",
            "Peugeot",
            "Aston Martin"
    };
    private final String [] enrollmentLetters = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N"
    };
    private final String [] colors = {
            "Azul",
            "Amarillo",
            "Verde",
            "Morado",
            "LGTBQ+",
            "Rojo",
            "Blanco roto",
            "Azul Cyan",
            "Verde agua",
            "Verde turquesa"
    };

    public Vehicle(){
        this.color = generateRandomColor();
        this.mark = generateRandomMark();
        this.enrollment = generateRandomEnrollment();
        this.maxSpeed = generateRandomMaxSpeed();
    }

    public Vehicle(double maxSpeed, String enrollment, String color, String mark) {
        this.maxSpeed = maxSpeed;
        this.enrollment = enrollment;
        this.color = color;
        this.mark = mark;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public double generateRandomMaxSpeed(){
        return (Math.random() * 250) / 100;
    }

    public String generateRandomEnrollment() {
        String matricula = "";
        for (int i = 0; i < 6; i++){
            if(i < 5) {
                matricula += (int)(Math.random() * 10);
            } else {
                matricula += enrollmentLetters[(int)(Math.random() * enrollmentLetters.length)];
            }
        }
        return matricula;
    }

    public String generateRandomColor() {
        int randomPosition = (int)(Math.random() * colors.length);
        return colors[randomPosition];
    }

    public String generateRandomMark(){
        int randomPosition = (int)(Math.random() * marks.length);
        return marks[randomPosition];
    }

    @Override
    public String toString() {
        return "VelocidadMaxima= " + (String.format("%.2f", maxSpeed)) + "\n" +
                "Matricula= '" + enrollment + "\n" +
                "color= '" + color + "\n" +
                "Marca= '" + mark ;
    }
}
