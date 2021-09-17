package com.hemanth.java8features.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Hemanth","IT",2600000));
        employees.add(new Employee(102,"Anil","Finance",260000));
        employees.add(new Employee(103,"Kiran","Finance",260000));
        employees.add(new Employee(101,"Teja","Core",600000));
        employees.add(new Employee(101,"Aadharsh","Admin",600000));

        return employees;
    }


}
