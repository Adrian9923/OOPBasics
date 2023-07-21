package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split(" ");
            String name = cmdParts[0];
            String id = cmdParts[1];
            int age = Integer.parseInt(cmdParts[2]);

            Person person = new Person(name, id, age);

            Person foundPerson = null;
            for (int i = 0; i < people.size(); i++) {
                Person checkPerson = people.get(i);
                if (checkPerson.getId().equals(person.getId())) {
                    foundPerson = checkPerson;
                    break;
                }
            }
            if (foundPerson == null) {
                people.add(person);
            }else {
                foundPerson.setName(person.getName());
                foundPerson.setAge(person.getAge());
            }

            command = scanner.nextLine();
        }

        people.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        for (Person person : people) {
            System.out.println(person);
        }

    }
}


