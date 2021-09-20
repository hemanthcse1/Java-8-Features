package com.hemanth.java8features.stream.api.parallelstream;

import com.hemanth.java8features.stream.api.example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelEmployeeDAO {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i<=1000; i++){
            employees.add(new Employee(i,"Employee"+i, "A", Long.valueOf(new Random().nextInt(1000*100))));
        }
        return employees;
    }
}
