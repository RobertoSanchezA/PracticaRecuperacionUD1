package com.company.fair;

import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;

public class Space {
    protected ArrayList<Vehicle> vehicles;

    public Space(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String showVehicles(){
        String output = new String("");
        Iterator<Vehicle> it = this.vehicles.iterator();

        while (it.hasNext()){
            Vehicle vehicle= (Vehicle) it.next();

            output += "Vehiculo: "+  vehicle.getMark() + " \n" +
                    "\t Matricula -> " + vehicle.getEnrollment() + " \n" +
                    "\t Velocidad maxima de : " + vehicle.getMaxSpeed();
        }
        return output;
    }
}
