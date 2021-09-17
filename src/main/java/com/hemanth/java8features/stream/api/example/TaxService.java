package com.hemanth.java8features.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxEmployee(String input){
        return  (input.equalsIgnoreCase("Tax"))
                ? EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() < 500000).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxEmployee("non Tax"));
        System.out.println(evaluateTaxEmployee("Tax"));
    }
}
