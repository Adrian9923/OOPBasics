package com.company;

public class Tuple<F,S> {

    private F firstItem;
    private S secondItem;

    public Tuple(F firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public F getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(F firstItem) {
        this.firstItem = firstItem;
    }

    public S getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(S secondItem) {
        this.secondItem = secondItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.firstItem).append( " -> ").append(this.secondItem).toString();
    }
}