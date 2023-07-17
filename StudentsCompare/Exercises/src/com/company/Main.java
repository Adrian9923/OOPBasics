package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(" ");
            String firstName = cmdParts[0];
            String lastName = cmdParts[1];
            double grade = Double.parseDouble(cmdParts[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        students.sort((n1, n2) -> Double.compare(n2.getGrade(), n1.getGrade()));

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
