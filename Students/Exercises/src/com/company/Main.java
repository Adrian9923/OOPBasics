package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = scanner.next();
        while (!command.equals("end")){
            Student student = new Student(command, scanner.next(), scanner.nextInt(), scanner.next());

            students.add(student);
            command = scanner.next();
        }

        String askedCity = scanner.next();
        for (Student student : students) {
            if (askedCity.equals(student.getHomeTown())) {
                System.out.println(student);
            }
        }

    }
}
