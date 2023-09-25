package com.company;


import java.util.List;

public class ListyIterator {

    private List<String> collection;
    private int currentIndex;

    public ListyIterator(List<String> collection) {
        this.collection = collection;
        this.currentIndex = 0;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return currentIndex < collection.size() - 1;
    }

    public void print() {
        if (collection.isEmpty()) {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        System.out.println(collection.get(currentIndex));
    }

   /* public void printAll() {
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(collection.get(i) + " ");
        }
        System.out.println();
    }*/
    public void printAll() {
        collection.forEach(element -> {
            System.out.print(element + " ");
        });
        System.out.println();
    }
}