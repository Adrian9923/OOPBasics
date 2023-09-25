package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            try {

                String line = scanner.nextLine();
                if (line.equals("END")) {
                    break;
                } else if (line.startsWith("Push")) {
                    String[] elements = line.substring(5).split(", ");
                    for (String element : elements) {
                        stack.push(Integer.parseInt(element));
                    }
                } else if (line.equals("Pop")) {
                    stack.pop();
                }
            }catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }
        }

        int n = 2;
        while (n > 0) {
            for (int element : stack) {
                System.out.println(element);
            }
            n--;
        }
    }
}


