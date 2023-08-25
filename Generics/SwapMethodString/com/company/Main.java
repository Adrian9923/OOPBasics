package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Box> content = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            Box box = new Box<>(command);
            content.add(box);
        }

        String[] tokens = scanner.nextLine().split("\\s+");
        int index1 = Integer.parseInt(tokens[0]);
        int index2 = Integer.parseInt(tokens[1]);
        Box.swapElements(content, index1, index2);


        for (Box box : content) {
            System.out.println(box);
        }

    }


}


