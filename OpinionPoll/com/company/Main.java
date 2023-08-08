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
        people.sort((f,s) -> f.getName().compareTo(s.getName()));
        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }

    }
}
