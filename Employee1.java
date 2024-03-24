package com.arr.java8;

import java.util.LinkedList;
import java.util.List;

public class Employee1 {
    private String department;
    private double salary;
    private boolean isFullTime;

    // Constructor, getters, and setters
    public Employee1(String department, double salary, boolean isFullTime) {
        this.department = department;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public static void main(String[] args) {
     // Other methods...
    // public static void employeeInit() {
    Employee1 e1 = new Employee1("IT", 10000, false);
    Employee1 e2 = new Employee1("Commerce", 2000, true);
    Employee1 e3 = new Employee1("Infra", 30000, true);
    Employee1 e4 = new Employee1("Business", 40000, true);

    List<Employee1> employees = new LinkedList<Employee1>();
    employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);

    final double SALARY_THRESHOLD = 100000.0;
    final double DISCOUNT_FACTOR = 0.9; // 10% discount

    employees.stream()
    // Step 1: Filter to include only full-time employees
   .filter(Employee1::isFullTime)
   // Step 2 & 3: Group by department and sum the salaries
    .collect()
    }
}
