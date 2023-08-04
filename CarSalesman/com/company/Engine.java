package com.company;

public class Engine {
    private String model;
    private int power;
    private String displacements;
    private String efficiency;

    public Engine(String model, int power, String displacements, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this(model, power, "n/a", "n/a");
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacements() {
        return displacements;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
