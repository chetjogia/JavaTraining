package com.exercises;

public class Greeter {
    private String name;
    public Greeter(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
        System.out.println(getName());
    }


}
