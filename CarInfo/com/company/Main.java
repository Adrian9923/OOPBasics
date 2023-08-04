package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdPArts = command.split(" ");
            String brand = cmdPArts[0];
            String model = cmdPArts[1];
            int hp = Integer.parseInt(cmdPArts[2]);
            Car car = new Car(brand, model, hp);
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
