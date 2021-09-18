package com.hemanth.java8features.stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hemanth");
        list.add("Kumar");
        list.add("Anil");
        list.add("Kiran");
        list.add("Teja");
        list.add("Aadharsh");

        // Traditional method by using foreach
        for (String s : list) {
            System.out.println(s);
        }

        // Consumer functional interface with lambda expression
        list.stream().forEach((s) -> System.out.println(s));


        // with maps using lambda expression
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hemanth");
        map.put(2, "Kumar");
        map.put(3, "Anil");
        map.put(4, "Kiran");

        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // using stream
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        System.out.println("\n \n");



        Consumer<String> consumer = (s)-> System.out.println(s);
        //consumer.accept("Hemanth Kumar");

        for (String s:list){
            consumer.accept(s);
        }

        System.out.println("\n ----------------filter method----------------\n");

        List<String> list1 = new ArrayList<>();
        list1.add("Hemanth");
        list1.add("Kumar");
        list1.add("Anil");
        list1.add("Kiran");
        list1.add("Teja");
        list1.add("Aadharsh");

        // traditional
        for (String s: list1){
            if (s.startsWith("A")){
                System.out.println(s);
            }
        }
        System.out.println("with stream api");
        //Stream api
        list1.stream().filter((s) -> s.startsWith("H")).forEach((s)-> System.out.println(s));

        System.out.println("\n ----------------filter method using map----------------\n");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Hemanth");
        map1.put(2, "Kumar");
        map1.put(3, "Anil");
        map1.put(4, "Kiran");

        map1.entrySet().stream().filter(k -> k.getKey()%2 == 0).forEach((s)-> System.out.println(s));

        int array[] = new int[10];

    }
}
