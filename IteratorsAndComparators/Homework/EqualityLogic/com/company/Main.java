package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleNameComparator = new ArrayList<>();
        List<Person> peopleAgeComparator = new ArrayList<>();

        NameComparator nameComparator = new NameComparator();
        AgeComparator ageComparator = new AgeComparator();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            peopleNameComparator.add(person);
            peopleAgeComparator.add(person);
        }
        Collections.sort(peopleNameComparator, nameComparator);
        Collections.sort(peopleAgeComparator, ageComparator);

        System.out.printf("%d\n",peopleNameComparator.size());
        System.out.printf("%d",peopleAgeComparator.size());
    }
}


