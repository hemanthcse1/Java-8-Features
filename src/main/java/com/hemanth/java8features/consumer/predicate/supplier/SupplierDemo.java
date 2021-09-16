package com.hemanth.java8features.consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Traditional way of using Supplier FunctionalInterface
/*public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "Hi Hemanth";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/


// Supplier FunctionalInterface using Lambda expressions
public class SupplierDemo {

    public static void main(String[] args) {

        // Method 1
       /* Supplier<String> supplier = ()-> "Hello Hemanth";
        System.out.println(supplier.get());*/

        // Method 2
       /* Supplier<String> supplier = ()-> "Hello Hemanth";
        List<String> list = Arrays.asList("Hemanth","Kumar","Anil","Kiran");
        System.out.println(list.stream().findAny().orElseGet(supplier));*/

        // Method 3
        List<String> list = Arrays.asList("Hemanth","Kumar","Anil","Kiran");
        System.out.println(list.stream().findAny().orElseGet(()-> "Hello Hemanth"));


    }
}
