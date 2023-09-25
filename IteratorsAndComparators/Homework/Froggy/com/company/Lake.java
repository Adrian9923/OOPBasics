package com.company;


import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> numbers;

    public Lake(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int index = 0;
        private boolean even = true;

        @Override
        public boolean hasNext() {
            return index < numbers.size();
        }

        @Override
        public Integer next() {
            int number = numbers.get(index);
            index += even ? 2 : 1;
            if (index >= numbers.size() && even) {
                even = false;
                index = 1;
            }
            return number;
        }
    }
}