package com.company.vehicles;

public class Vehicle {
    protected String modelName;
    protected String enrollment; //matricula
    protected String color;


    public Vehicle(String modelName, String enrollment, String color) {
        this.modelName = modelName;
        this.enrollment = enrollment;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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


}
