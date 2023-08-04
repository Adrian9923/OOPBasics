package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cat> cats = new ArrayList<>();

        Cat cat;
        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] cmdParts = command.split("\\s+");
            String breed = cmdParts[0];
            String name = cmdParts[1];
            double characteristic = Double.parseDouble(cmdParts[2]);

            cat = new Cat(breed, name, characteristic);
            cats.add(cat);

            command = scanner.nextLine();
        }
        String query = scanner.nextLine();
        for (Cat cat1 : cats) {
            if (cat1.getName().equals(query)){
                System.out.println(cat1);
            }
        }

    }


}


