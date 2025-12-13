package com.syed.corejava;

import java.util.*;
import java.util.stream.*;

public class SecondHighestSalaryPerDept {
    static class Employee {
        final String name;
        final String department;
        final int salary;

        Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + " (" + department + ", " + salary + ")";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 100),
            new Employee("Bob", "IT", 120),
            new Employee("Cara", "IT", 120),
            new Employee("Dan", "IT", 90),
            new Employee("Eve", "HR", 110),
            new Employee("Frank", "HR", 105),
            new Employee("Gina", "HR", 110),
            new Employee("Hank", "Sales", 95)
        );

        // Map<Department, Optional<Integer>>: 2nd highest UNIQUE salary per department
        Map<String, Optional<Integer>> deptToSecondHighestSalary =
            employees.stream()
                .collect(Collectors.groupingBy(
                    e -> e.department,
                    Collectors.collectingAndThen(
                        Collectors.mapping(e -> e.salary, Collectors.toSet()), // unique salaries
                        salaries -> salaries.stream()
                            .sorted(Comparator.reverseOrder())
                            .skip(1)
                            .findFirst()
                    )
                ));

        System.out.println("Second highest salary per department (unique): " + deptToSecondHighestSalary);

        // If you want the employees who have that 2nd highest salary:
        Map<String, List<Employee>> deptToSecondHighestEmployees =
            employees.stream()
                .collect(Collectors.groupingBy(
                    e -> e.department
                )).entrySet().stream()
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    entry -> {
                        List<Employee> group = entry.getValue();
                        // compute 2nd highest unique salary
                        Optional<Integer> second =
                            group.stream().map(e -> e.salary).distinct()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst();
                        return second.map(sal ->
                                group.stream().filter(e -> e.salary == sal).collect(Collectors.toList())
                            ).orElseGet(Collections::emptyList);
                    }
                ));

        System.out.println("Employees at 2nd highest salary per department: " + deptToSecondHighestEmployees);
    }
}