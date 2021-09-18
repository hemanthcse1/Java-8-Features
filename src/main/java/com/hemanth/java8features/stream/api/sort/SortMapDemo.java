package com.hemanth.java8features.stream.api.sort;

import com.hemanth.java8features.stream.api.example.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("six", 6);
        map.put("twelve", 12);
        map.put("four", 4);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        // traditional way
      /*  Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }*/


        // using lambda expression
      /*  Collections.sort(entries,((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }*/

        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);



        Map<Employee, Integer> employeeMap = new TreeMap<>(( o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

        employeeMap.put(new Employee(101, "Hemanth", "IT", 2600000), 12);
        employeeMap.put(new Employee(102, "Anil", "Finance", 300000), 86);
        employeeMap.put(new Employee(103, "Kiran", "Finance", 400000), 87);
        employeeMap.put(new Employee(106, "Teja", "Core", 600000), 95);
        employeeMap.put(new Employee(104, "Aadharsh", "Admin", 800000), 23);

       // System.out.println(employeeMap);

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
                .forEach(System.out::println);

    }
}
