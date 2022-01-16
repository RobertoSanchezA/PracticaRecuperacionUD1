package com.company.vehicles;

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

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double generateRandomMaxSpeed(){
        return (Math.random() * 250) / 100;
    }

    public String generateRandomEnrollment() {
        String matricula = "";
        for (int i = 0; i < 7; i++){
            if(i < 5) {
                matricula += Math.random() * 10;
            } else {
                matricula += (char)(Math.random() * 91 + 65);
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


}
