package com.company;

import java.util.List;

public class Box<T extends Comparable<T>>{

    private T value;


    public Box(T value) {
        this.value = value;
    }

    public static <T extends Comparable<T>> int compare(List<T> list, T element) {
        int counter = 0;
        for (T generic : list) {
            if (generic.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

}