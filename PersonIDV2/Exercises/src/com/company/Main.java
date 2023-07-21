package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",this.name, this.id, this.age);
        }
    }


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

        people.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        for (Person person : people) {
            System.out.println(person);
        }

    }
}


