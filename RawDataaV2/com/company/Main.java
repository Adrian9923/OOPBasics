package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed,enginePower);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            double tire1pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            Tire tire1 = new Tire(tire1pressure,tire1Age);
            double tire2pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            Tire tire2 = new Tire(tire2pressure,tire2Age);
            double tire3pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            Tire tire3 = new Tire(tire3pressure,tire3Age);
            double tire4pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);
            Tire tire4 = new Tire(tire4pressure,tire4Age);

            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            cars.add(car);
        }
        String command = scanner.nextLine();
        ArrayList<String> output = new ArrayList<>();
        if (command.equals("fragile")) {
            cars.forEach(e -> {
                if (e.getCargo().getCargoType().equals("fragile")) {
                    for (Tire tireSet : e.getTires()) {
                        if (tireSet.getPressure() < 1) {
                            output.add(e.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            cars.forEach(e -> {
                if (e.getCargo().getCargoType().equals("flammable") && e.getEngine().getEnginePower() > 250) {
                    output.add(e.getModel());
                }
            });
        }
        output.forEach(System.out::println);


    }
}
