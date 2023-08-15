package com.company;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int nuOfDays, Season season, Discount discount) {
        int multiplier = season.getValue();
        double discountMultiplier = discount.getValue() / 100.0;
        double priceWithoutDiscount = nuOfDays * pricePerDay * multiplier;
        double discountAmount = priceWithoutDiscount * discountMultiplier;
        return priceWithoutDiscount - discountAmount;
    }
}
