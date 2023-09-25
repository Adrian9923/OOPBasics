package com.company;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return first.getName().toLowerCase().compareTo(second.getName().toLowerCase());
    }
}
