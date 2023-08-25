package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Tuple> tuples = new ArrayList<>();
        readFirstTuple(scanner, tuples);
        readSecondTuple(scanner, tuples);
        readThirdTuple(scanner, tuples);
        printTuples(tuples);

    }

    private static void printTuples(List<Tuple> tuples) {
        StringBuilder sb = new StringBuilder();
        for (Tuple tuple : tuples) {
            sb.append(tuple).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void readFirstTuple(Scanner scanner, List<Tuple> tuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = tokens[0] + " " + tokens[1];
        String city = tokens[2];
        Tuple<String, String> firstTuple = new Tuple<>(name, city);
        tuples.add(firstTuple);
    }

    private static void readSecondTuple(Scanner scanner, List<Tuple> tuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = tokens[0];
        int hobbies = Integer.parseInt(tokens[1]);
        Tuple<String, Integer> secondTuple = new Tuple<>(name, hobbies);
        tuples.add(secondTuple);
    }

    private static void readThirdTuple(Scanner scanner, List<Tuple> tuples) {
        String[] tokens = scanner.nextLine().split("\\s+");
        int integerElement = Integer.parseInt(tokens[0]);
        double doubleElement = Double.parseDouble(tokens[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<>(integerElement, doubleElement);
        tuples.add(thirdTuple);
    }
}


