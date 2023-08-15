package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bfr.readLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int numOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2].toUpperCase());
        Discount discount;
        if (input[3].equals("SecondVisit")) {
            discount = Discount.SECOND_VISIT;
        }else {
            discount = Discount.valueOf(input[3].toUpperCase());
        }

        System.out.printf("%.2f", PriceCalculator.calculatePrice(pricePerDay, numOfDays, season, discount));
    }
}


