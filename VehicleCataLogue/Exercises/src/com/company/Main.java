package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> sortedVehicles = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split(" ");
            String type = cmdParts[0];
            String model = cmdParts[1];
            String color = cmdParts[2];
            int hp = Integer.parseInt(cmdParts[3]);

            Vehicle vehicle = new Vehicle(type, model, color, hp);
            vehicles.add(vehicle);

            command = scanner.nextLine();
        }
        int carsCounter = 0;
        int totalHpCars = 0;
        double averageHpCars;
        int trucksCounter = 0;
        int totalHpTrucks = 0;
        double averageHpTrucks;
        String type = scanner.nextLine();
        while (!type.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(type)){
                    sortedVehicles.add(vehicle);
                }
            }

            type = scanner.nextLine();
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                carsCounter++;
                totalHpCars += vehicle.getHorsePower();
            }
            else if (vehicle.getType().equals("truck")) {
                trucksCounter++;
                totalHpTrucks += vehicle.getHorsePower();
            }
        }
        averageHpCars = (double) totalHpCars / carsCounter;
        averageHpTrucks = (double) totalHpTrucks / trucksCounter;

        for (Vehicle sortedVehicle : sortedVehicles) {
            System.out.println(sortedVehicle);
        }
        System.out.printf("Cars have an average horsepower of: %.2f.\n",averageHpCars);
        System.out.printf("Trucks have an average horsepower of: %.2f.\n",averageHpTrucks);
    }
}
