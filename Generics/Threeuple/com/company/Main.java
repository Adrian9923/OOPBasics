package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Threeuple> threeuples = new ArrayList<>();
        readFirstThreeuple(scanner, threeuples);
        readSecondThreeupe(scanner, threeuples);
        readThirdThreeuple(scanner, threeuples);
        printTuples(threeuples);

    }

    private static void printTuples(List<Threeuple> threeuples) {
        StringBuilder sb = new StringBuilder();
        for (Threeuple threeuple : threeuples) {
            sb.append(threeuple).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void readFirstThreeuple(Scanner scanner, List<Threeuple> threeuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = tokens[0] + " " + tokens[1];
        String city = tokens[2];
        String country = tokens[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(name, city, country);
        threeuples.add(firstThreeuple);
    }

    private static void readSecondThreeupe(Scanner scanner, List<Threeuple> threeuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = tokens[0];
        int hobbies = Integer.parseInt(tokens[1]);
        boolean isHappy = tokens[2].equals("happy");
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(name, hobbies, isHappy);
        threeuples.add(secondThreeuple);
    }

    private static void readThirdThreeuple(Scanner scanner, List<Threeuple> threeuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = tokens[0];
        double accountBalance = Double.parseDouble(tokens[1]);
        String bankName = tokens[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(name, accountBalance, bankName);
        threeuples.add(thirdThreeuple);
    }
}


