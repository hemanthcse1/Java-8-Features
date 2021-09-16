package com.hemanth.java8features.lambda.expressions;

public class CalculatorImpl {

    public static void main(String args[]) {

        // as old method
        /*com.hemanth.java8features.lambda.expressions.Calculator calculator = new com.hemanth.java8features.lambda.expressions.Calculator() {
            @Override
            public void Greet() {
                System.out.println("Good morning");
            }
        };

        calculator.Greet();
        */

        //using lambda expression
      /*  com.hemanth.java8features.lambda.expressions.Calculator calc = () ->{
            System.out.println("Good Afternoon");
        };
        calc.Greet();*/


        // using lambda expression in optimized way
       /* com.hemanth.java8features.lambda.expressions.Calculator calc = () -> System.out.println("Good Evening");
        calc.Greet();*/


        // lambda expression with input parameters

        // method 1
  /*     com.hemanth.java8features.lambda.expressions.Calculator calculator = (input) -> {
           System.out.println(input);
       };
       calculator.sum(1234);*/


        // Method 2
        /*com.hemanth.java8features.lambda.expressions.Calculator calculator = (input) -> System.out.println(input);
        calculator.sum(1234);*/


        // lambda expression with 2 input paramters
        //method 1
       /* com.hemanth.java8features.lambda.expressions.Calculator calculator = (int numberOne,int numberTwo) -> {
            return numberOne - numberTwo;
        };

        int result = calculator.substraction(20,10);
        System.out.println(result);*/

        //Method 2
/*        com.hemanth.java8features.lambda.expressions.Calculator calculator = (numberOne,numberTwo) -> numberOne - numberTwo;
        System.out.println(calculator.substraction(30,10));*/


        // Method 3
        /*com.hemanth.java8features.lambda.expressions.Calculator calculator = (int numberOne, int numberTwo) -> {
            if (numberOne < numberTwo){
                throw new RuntimeException("Invalid input values");
            }else {
                return numberOne - numberTwo;
            }
        };

        int result = calculator.substraction(15, 10);
        System.out.println(result);*/


    }
}
