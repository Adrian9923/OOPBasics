package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }
        for (int starCount = size - 1; starCount >= 1; starCount--) {
            printRow(size, starCount);
        }

    }

    private static void printRow(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
        for (int column = 1; column < starCount; column++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}


