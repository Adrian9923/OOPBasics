package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> content = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {

            String[] cmdParts = command.split("\\s+");
            switch (cmdParts[0]) {
                case "Add":
                    content.add(cmdParts[1]);
                    break;
                case "Remove":
                    content.remove(Integer.parseInt(cmdParts[1]));
                    break;
                case "Max":
                    System.out.println(Box.getMax(content));
                    break;
                case "Min":
                    System.out.println(Box.getMin(content));
                    break;
                case "Greater":
                    System.out.println(Box.countGreaterThan(content, cmdParts[1]));
                    break;
                case "Swap":
                    Box.swapElements(content, Integer.parseInt(cmdParts[1]), Integer.parseInt(cmdParts[2]));
                    break;
                case "Contains":
                    System.out.println(content.contains(cmdParts[1]));
                    break;
                case "Print":
                    for (String s : content) {
                        System.out.println(s);
                    }
                    break;
                case "Sort":
                    Box.sort(content);
                    break;
            }

            command = scanner.nextLine();
        }
    }

}


