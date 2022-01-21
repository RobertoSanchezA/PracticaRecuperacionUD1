package com.company.fair;

import com.company.vehicles.Boat;
import com.company.vehicles.Car;
import com.company.vehicles.Motorcycle;
import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;

public class FairManager {
    private final ArrayList<Space> spaces;

    public FairManager(int numSpaces, int numVehicles) {
        this.spaces = new ArrayList<Space>();
        generateSpaces(numSpaces, numVehicles);
        printVehicles();
    }

    private void generateSpaces(int numSpaces, int numVehicles) {
        int vehicleCounter = 0;
        if(numVehicles >= numSpaces ) {
            for (int i = 0; i < numSpaces; i++) {
                if(vehicleCounter > numVehicles) break;
                ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
                vehicleList.add(generateRandomVehicle());
                vehicleCounter++;
                this.spaces.add(new Space(vehicleList));
            }
        } else {
            System.out.println("La feria indicada no se puede crear");
        }
    }

    private Vehicle generateRandomVehicle() {
        int randomNum = (int)(Math.random() * 4);
        if (randomNum == 1) return new Car();
        else if (randomNum == 2) return new Motorcycle();
        else return new Boat();
    }

    private void printVehicles(){
        Iterator<Space> iterator = this.spaces.iterator();
        int spaceNumber = 0;
        while (iterator.hasNext()) {
            Space actualSpace = iterator.next();
            System.out.println("******* Espacio " + spaceNumber + " *********");
            Iterator<Vehicle> vehicleIterator = actualSpace.vehicles.iterator();
            while (vehicleIterator.hasNext()) {
                Vehicle actualVehicle = vehicleIterator.next();
                System.out.println(actualVehicle);
            }
            System.out.println("-----------------------------");
            spaceNumber++;
        }
    }
}
