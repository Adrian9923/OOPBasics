package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    list.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(Integer.parseInt(tokens[1])));
                    break;
            }
        }
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}


