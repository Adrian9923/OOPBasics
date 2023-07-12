package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(" ");
            String name = cmdParts[0];
            int age = Integer.parseInt(cmdParts[1]);

            Person person = new Person(name, age);
            persons.add(person);
        }

        persons.sort((n1,n2) -> n1.getName().compareTo(n2.getName()));
        for (Person person : persons) {
            if (person.getAge() > 30){
                System.out.println(person);
            }
        }

    }
}
