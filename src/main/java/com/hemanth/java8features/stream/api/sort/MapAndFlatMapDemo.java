package com.hemanth.java8features.stream.api.sort;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {

    public static void main(String[] args) {

        List<Customer> customers = EkartDAO.getAllCustomers();

        // List<Customer> convert List<String> -> Data Transfermation
        // mapping: customer -> customer.getEmail()
        List<String> emails = customers.stream().map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        System.out.println("\n-------------------------------------------------\n");

        // customer -> customer.getPhoneNumber() ->> one to one mapping
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());

        System.out.println(phoneNumbers);

        System.out.println("\n-------------------------------------------------\n");


        // customer -> customer.getPhoneNumber() ->> one to many mapping
        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

    }
}
