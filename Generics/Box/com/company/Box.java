package com.company;

public class Box<T>{

    private T value;


    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "java.lang.String: " + this.value;
    }
}
