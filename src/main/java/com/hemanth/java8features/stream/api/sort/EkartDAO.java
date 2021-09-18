package com.hemanth.java8features.stream.api.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDAO {

    public static List<Customer> getAllCustomers(){
        return Stream.of(
                new Customer(101,"Hemanth","hemanth@gamil.com", Arrays.asList("7954621358","9542365789")),
                new Customer(102,"Anil","anil@gamil.com", Arrays.asList("1346482355","0215478965")),
                new Customer(103,"Kiran","kiran@gamil.com", Arrays.asList("9456214896","9325478965")),
                new Customer(104,"Teja","teja@gamil.com", Arrays.asList("9654785123","8562314589")),
                new Customer(105,"Aadharsh","aadharsh@gamil.com", Arrays.asList("9654785123","8562314589"))
        ).collect(Collectors.toList());
    }
}
