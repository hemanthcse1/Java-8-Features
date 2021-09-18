package com.hemanth.java8features.stream.api.sort;

import com.hemanth.java8features.stream.api.example.Employee;
import com.hemanth.java8features.stream.api.example.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(45);
        list.add(12);
        list.add(25);
        list.add(6);



        //  Traditional way
        Collections.sort(list); // ascending order
        Collections.reverse(list); // descending order
        System.out.println(list);



        // using stream for primitive data types
        list.stream().sorted().forEach(s -> System.out.print(s+", ")); // ascending
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s+", ")); // descending



        // using stream for custom object
        List<Employee> employees = EmployeeDAO.getEmployees();

        // method 1
        //Collections.sort(employees,new MyComparator());

        // method 2
        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });*/

        // Method 3
        //Collections.sort(employees,(o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

        //System.out.println(employees);




        // using stream api

        // Method 1 using lambda express
        //employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        // Method 2 using comparator
        //employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);

        // Method 3 using method reference
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

    }
}

class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
