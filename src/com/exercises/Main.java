package com.exercises;

public class Main {
    public static void main(String[] args) {
        //exercise one
        Greeter greeter = new Greeter("Chet");
        greeter.sayHello();

        //exercise two + four
        Calculator testCalculator = new Calculator();
        System.out.println(testCalculator.addition(74, 36));
        System.out.println(testCalculator.multiply(25,5));

        String input = "hello";
        //exercise three
        long start = System.currentTimeMillis();
        String reversed = StringReverser.reverseString(input);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Reversed %s as %s in %s ms",input, reversed,end-start));

        start = System.currentTimeMillis();
        reversed = StringReverser.reverseString2(input);
        end = System.currentTimeMillis();
        System.out.println(String.format("Reversed %s as %s in %s ms",input, reversed,end-start));


    }
}