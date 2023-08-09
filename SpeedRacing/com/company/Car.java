package com.company;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1Km;
    private int traveledDistance;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.traveledDistance = 0;
    }

    public String getModel() {
        return model;
    }

    public void canIReachTheDistance(String model, double amountKm) {
        double neededLitres = amountKm * this.fuelCostFor1Km;

        if (this.fuelAmount >= neededLitres) {
            this.fuelAmount -= neededLitres;
            this.traveledDistance += amountKm;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.traveledDistance);
    }
}
