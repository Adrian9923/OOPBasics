package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        System.out.println(command + ":");
        for (CardSuits suit : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", suit.getValue(), suit.name());
        }
    }
}


