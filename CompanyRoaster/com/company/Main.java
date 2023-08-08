package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double highestAverageSalary = 0;
        String bestDepartment = "";

        List<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        Employee employee = null;
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            if (tokens.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            if (tokens.length == 5) {
                if (tokens[4].contains("@")) {
                    String email = tokens[4];
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department, age);
                }
            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }

            employees.add(employee);
        }


        List<String> departmentsList = employees.stream().
                map(Employee::getDepartment).
                distinct().collect(Collectors.toList());

        for (String department : departmentsList) {
            double sum = 0.0;
            int count = 0;
            for (Employee employee1 : employees) {
                if (employee1.getDepartment().equals(department)) {
                    sum += employee1.getSalary();
                    count++;
                }
            }
            if (sum / count > highestAverageSalary) {
                highestAverageSalary = sum / count;
                bestDepartment = department;
            }

        }

        System.out.println("Highest Average Salary: " + bestDepartment);
        employees.sort((f,s) -> Double.compare(s.getSalary(),f.getSalary()));
        for (Employee employee1 : employees) {
            if (employee1.getDepartment().equals(bestDepartment)) {
                System.out.println(employee1);
            }
        }

    }
}
