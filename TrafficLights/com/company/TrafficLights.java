package com.company;

public enum TrafficLights {
    RED(1), GREEN(2), YELLOW(3);
    private int value;
    TrafficLights(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
