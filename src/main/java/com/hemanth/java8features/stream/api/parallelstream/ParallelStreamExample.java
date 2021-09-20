package com.hemanth.java8features.stream.api.parallelstream;

import com.hemanth.java8features.stream.api.example.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

   /*     start = System.currentTimeMillis();
        IntStream.range(1,1000).forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("Plain Stream took time : "+(end-start));

        System.out.println("\n-------------------------------------------------\n");
        start = System.currentTimeMillis();
        IntStream.range(1,1000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("parallel Stream took time : "+(end-start));*/


       /* System.out.println("\n-------------------------------------------------\n");

        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });*/


        List<Employee> employees = ParallelEmployeeDAO.getEmployees();

        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary).mapToLong(i->i).average().getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" Avg salary : "+salaryWithStream);

        System.out.println("\n--------------------------------------------------\n");

        long start1 = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary).mapToLong(i->i).average().getAsDouble();
        long end1 = System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end1-start1)+" Avg salary : "+salaryWithParallelStream);

    }
}
