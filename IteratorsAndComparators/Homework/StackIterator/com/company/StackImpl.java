package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StackImpl implements Iterable<Integer> {
    private List<Integer> elements;

    public StackImpl() {
        this.elements = new ArrayList<>();
    }

    public void push(int element) {
        elements.add(element);
    }

    public int pop() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("No elements");
        }
        return elements.remove(elements.size() - 1);
    }

    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Integer> {
        private int index;

        public StackIterator() {
            this.index = elements.size() - 1;
        }

        public boolean hasNext() {
            return index >= 0;
        }

        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            return elements.get(index--);
        }
    }
}