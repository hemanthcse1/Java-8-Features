package com.hemanth.java8features.consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {

        // Method 1
       /* Consumer<Integer> consumer =(integer) -> System.out.println("Printing : "+integer);
        consumer.accept(10);*/


        // Method 2
       /* Consumer<Integer> consumer =(integer) -> System.out.println("Printing : "+integer);
        List<Integer> listIntegers = Arrays.asList(1,2,3,4,5);
        listIntegers.stream().forEach(consumer);*/

        // Method 3
        List<Integer> listIntegers = Arrays.asList(1,2,3,4,5);
        listIntegers.stream().forEach(integer -> System.out.println("Printing : "+integer));


    }

}
