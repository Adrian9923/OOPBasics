package com.company;

import java.util.List;

public class Box<T>{

    private T value;


    public Box(T value) {
        this.value = value;
    }
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


    public String toString() {
        return value.getClass().getName() + ": " + this.value;
    }
}
