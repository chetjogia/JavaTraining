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

        //exercise three
        System.out.println(StringReverser.reverseString("hello"));

    }
}