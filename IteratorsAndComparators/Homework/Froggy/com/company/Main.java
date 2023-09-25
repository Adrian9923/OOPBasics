package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (true) {
            if (command.equals("END")){
                break;
            }
        }

        Lake lake = new Lake(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1)
            System.out.print(numbers.get(i) + ", ");
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1){
                System.out.print(numbers.get(i));
            }
            else if (numbers.get(i) % 2 == 0)
                System.out.print(numbers.get(i) + ", ");
        }


    }
}


