package com.hemanth.java8features.stream.api.mapandreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,7,8,4,6,9,1);

        // traditional method
        int sum = 0;
        for (int number: numbers){
            sum += number;
        }
        System.out.println(sum);

        // using java 8 features
        int sum1 = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);

        // Using reduce
        Integer reduceSum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference =numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(mulResult);

        Integer maxValue =numbers.stream().reduce(0,(a,b)-> a>b?a:b);
        System.out.println(maxValue);

        Integer maxValue1 = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValue1);



        List<String> words = Arrays.asList("Corejava","Spring","Hibernate");

        String longestString = words.stream()
                .reduce((word1,word2)->word1.length() > word2.length()?word1:word2)
                .get();

        System.out.println(longestString);


        // Get employee whos grade is A
        // Get Salary of the employee
        double averageSalary = EmployeeDAO.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToLong(i->i)
                .average().getAsDouble();

        System.out.println("avarage salary : "+averageSalary);

        // Get employee whos grade is A
        // Get Salary of the employee
        // get sum of salary
        double sumSalary = EmployeeDAO.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToLong(i->i)
                .sum();

        System.out.println("Sum of salary : "+sumSalary);

    }
}
