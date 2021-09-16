package com.hemanth.java8features.consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Traditional way of implementing Predicate FunctionalInterface
/*public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if (integer%2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println( predicate.test(4));
    }
}*/

// Using lambda expression, implementing Predicate FunctionalInterface
public class PredicateDemo {

    public static void main(String[] args) {

        // Method 1
       /* Predicate<Integer> predicate = (integer) -> {
            if (integer%2 == 0){
                return true;
            }else {
                return false;
            }
        };
        System.out.println( predicate.test(8)); // returns true */


        // Method 2
        /*Predicate<Integer> predicate = (integer) -> integer%2 == 0;
        System.out.println( predicate.test(5)); // returns false*/


        // Method 3
       /* Predicate<Integer> predicate = (integer) -> integer%2 == 0;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(predicate).forEach(integer -> System.out.println("Printing even numbers: "+integer));*/


        // Method 4
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream()
                .filter((integer) -> integer % 3 == 0)
                .forEach(integer -> System.out.println("Printing odd numbers: " + integer));

    }
}
