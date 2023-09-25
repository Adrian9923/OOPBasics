package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] cmdParts = command.split("\\s+");
            String name;
            int age;
            String town;
            if (cmdParts.length == 3) {
                name = cmdParts[0];
                age = Integer.parseInt(cmdParts[1]);
                town = cmdParts[2];
            }else {
                name = cmdParts[0];
                age = Integer.parseInt(cmdParts[1]);
                town = cmdParts[2] + " " + cmdParts[3];
            }

            Person person = new Person(name, age, town);
            people.add(person);
            command = scanner.nextLine();
        }

        int comparablePerson = Integer.parseInt(scanner.nextLine());
        int samePeople = 0;
        int differentPeople = 0;
        try {

            for (int i = 0; i < people.size(); i++) {
                if (people.get(i).compareTo(people.get(comparablePerson)) == 0) {
                    samePeople++;
                } else {
                    differentPeople++;
                }
            }
            System.out.printf("%d %d %d", samePeople, differentPeople, people.size());
        }catch (IndexOutOfBoundsException e) {
            System.out.println("No matches");
        }
    }
}


