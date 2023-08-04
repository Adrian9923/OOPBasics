package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Engine engine;
            String[] engineParts = scanner.nextLine().split("\\s+");
            String model = engineParts[0];
            int power = Integer.parseInt(engineParts[1]);
            if (engineParts.length == 4) {
                String displacement = engineParts[2];
                String efficiency = engineParts[3];
                engine = new Engine(model,power,displacement,efficiency);
            }
            else if (engineParts.length == 3) {
                if (isNum(engineParts[2])){
                    engine = new Engine(model,power,engineParts[2], "n/a");
                }else {
                    engine = new Engine(model,power,"n/a",engineParts[2]);
                }
            }else {
                engine = new Engine(model,power);
            }
            engines.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            Car car;
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            String engineName = tokens[1];
            Engine engine = null;
            for (Engine engine1 : engines) {
                if (engine1.getModel().equals(engineName)){
                    engine=engine1;
                    break;
                }
            }
            if (tokens.length == 4) {
                String weight = tokens[2];
                String color = tokens[3];
                car = new Car(model, engine, weight, color);
            }else if (tokens.length == 3){
                if (isNum(tokens[2])) {
                    String weight = tokens[2];
                    car = new Car(model, engine, weight, "n/a");
                }else {
                    String color = tokens[2];
                    car = new Car(model,engine,"n/a", color);
                }
            }else {
                car = new Car(model,engine);
            }
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

    }

    private static boolean isNum(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
}


