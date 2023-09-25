package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> collection = new ArrayList<>();
        ListyIterator iterator = new ListyIterator(collection);

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    collection = new ArrayList<>(List.of(tokens).subList(1, tokens.length));
                    iterator = new ListyIterator(collection);
                    break;
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        iterator.print();
                    } catch (UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }

    }
}


