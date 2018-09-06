package com.levelksk.spring4.beans;

public class HelloWorld {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hello() {
        System.out.println("hello: " + name + ", your age is " + age);
    }

}
