package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostPerKm = Double.parseDouble(tokens[2]);
            Car car = new Car(model,fuelAmount,fuelCostPerKm);
            cars.add(car);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split("\\s+");
            String model = cmdParts[1];
            double amountKm = Double.parseDouble(cmdParts[2]);

            Car carForDriving = cars.stream().filter(x -> x.getModel().equals(model)).findFirst().get();

            carForDriving.canIReachTheDistance(model, amountKm);

            command = scanner.nextLine();
        }

        for (Car car : cars) {
            System.out.println(car);
        }


    }
}
