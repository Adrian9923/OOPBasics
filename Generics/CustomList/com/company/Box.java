package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>>{

    private List<T> content;


    public Box() {
        this.content = new ArrayList<>();
    }

    public void add(T element) {
        this.content.add(element);
    }
    public void remove(int index) {
        this.content.remove(index);
    }

    public boolean contains(List<T> list, T element) {
        for (T t : list) {
            if (t.equals(element))
                return true;
        }
        return false;
    }


    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int counter = 0;
        for (T generic : list) {
            if (generic.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

}