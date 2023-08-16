package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bottomLeftX = array[0];
        int bottomLeftY = array[1];
        int topRightX = array[2];
        int topRightY = array[3];

        Point bottomLeft = new Point(bottomLeftX,bottomLeftY);
        Point topRight = new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int x = pointCoordinates[0];
            int y = pointCoordinates[1];

            Point point = new Point(x, y);

            System.out.println(rectangle.contains(point));
        }

    }


}


