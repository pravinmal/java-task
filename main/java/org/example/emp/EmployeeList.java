package org.example.emp;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee(1,"Johan",50000,25),
                new Employee(2,"Bob",85000,29),
                new Employee(3,"Fiza",52000,27),
                new Employee(4,"Amit",125000,35),
                new Employee(5,"Suraj",100000,32),
                new Employee(6,"Ketaki",35000,25),
                new Employee(7,"Rina",105000,28),
                new Employee(8,"Tina",50000,27),
                new Employee(9,"Bob",110000,33),
                new Employee(10,"Ravi",88000,27)
        );
        System.out.println("All Employee List: ");
        employees.forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------");

        System.out.println("\nEmployees with salary > 60000:");
        List<Employee> highestSlary = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toList());
        highestSlary.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");

        System.out.println("\nEmployee with the highest salary:");
        Optional<Employee> highestSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestSalaryEmployee.ifPresent((System.out::println));

        System.out.println("------------------------------------------------------------------------");

        // Find employees with age > 30
        System.out.println("\nEmployees with age > 30:");
        List<Employee> findEmpAge = employees.stream()
                .filter(e -> e.getAge() > 30)
                .collect(Collectors.toList());
        findEmpAge.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nAverage Age of Employees:");
        double avgAge = employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0);
        System.out.println(avgAge);

        System.out.println("------------------------------------------------------------------------");


        Map<Integer, List<Employee>> sameAgeEmployees =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getAge))
                        .entrySet().stream()
                        .filter(e -> e.getValue().size() > 1) // keep only ages with duplicates
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        ));

        System.out.println("\nEmployees having the same age:");
        sameAgeEmployees.forEach((age, list) -> {
            System.out.println("Age " + age + ":");
            list.forEach(e -> System.out.println("  " + e));
        });

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nEmployees whose name starts with 'R':");
        List<Employee> nameStartWithR = employees.stream()
                .filter(e ->e.getName().toLowerCase().startsWith("r"))
                .collect(Collectors.toList());
        nameStartWithR.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nEmployees having the same name:");


        Map<String, List<Employee>> sameNameEmployees =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getName))
                        .entrySet().stream()
                        .filter(e -> e.getValue().size() > 1) // only duplicates
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        ));

        sameNameEmployees.forEach((name, list) -> {
            System.out.println("Name: " + name);
            list.forEach(emp -> System.out.println("  " + emp));
        });

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nEmployees with salary = 100000:");
        List<Employee > namesWithExactSalary = employees.stream()
                .filter(e -> e.getSalary() == 100000)
                        .collect(Collectors.toList());
        namesWithExactSalary.forEach(System.out::println);

    }
}