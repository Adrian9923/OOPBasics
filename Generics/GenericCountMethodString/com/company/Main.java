package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> genericList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            genericList.add(input);
        }
        String comparingElement = scanner.nextLine();
        System.out.println(compare(genericList, comparingElement));
    }

    public static <T extends Comparable<T>> int compare(List<T> list, T element) {
        int counter = 0;
        for (T generic : list) {
            if (generic.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }
}


