package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split("\\s+");
            String name = cmdParts[0];
            int age = Integer.parseInt(cmdParts[1]);

            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream()
                .filter(f -> f.getAge() > 30)
                .sorted((f,s) -> f.getName().compareTo(s.getName()))
                .forEach(person -> System.out.println(person));

    }
}
