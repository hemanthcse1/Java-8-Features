package com.hemanth.java8features.stream.api.mapandreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

    public static List<Employee> getEmployees(){
        return Stream.of(new Employee(101,"Hemanth","A",185000),
                new Employee(102,"Teja","B",35000),
                new Employee(103,"Aadharsh","B",45000),
                new Employee(104,"Jhon","A",95000),
                new Employee(105,"Kiran","B",25000))
                .collect(Collectors.toList());
    }
}
