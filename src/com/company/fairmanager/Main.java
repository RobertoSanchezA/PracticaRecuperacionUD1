package com.company.fairmanager;

import com.company.fair.FairManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el numero de vehiculos");
        int numVehicles = scan.nextInt();

        System.out.println("Introduce el numero de espacios para la feria");
        int numSpaces = scan.nextInt();
        FairManager fair = new FairManager(numVehicles, numSpaces);
    }
}
