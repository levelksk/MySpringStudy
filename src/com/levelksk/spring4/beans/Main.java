package com.levelksk.spring4.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
        // 创建HelloWorld的一个对象
        HelloWorld helloWorld = new HelloWorld();
        // 为 name 属性赋值
        helloWorld.setName("levelksk");
        */

        // 1. 创建 Spring 的IOC 容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 从IOC容器中获取Bean的实例
        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");

        helloWorld.hello();

        Car car1 = (Car)ctx.getBean("car1");

        System.out.println(car1);

        Car car2 = (Car)ctx.getBean("car2");

        System.out.println(car2);

        Car car3 = (Car)ctx.getBean("car3");

        System.out.println(car3);

        Person person1 = (Person)ctx.getBean("person1");

        System.out.println(person1);

        Person person2 = (Person)ctx.getBean("person2");

        System.out.println(person2);

        Person person3 = (Person)ctx.getBean("person3");

        System.out.println(person3);

        Person person4 = (Person)ctx.getBean("person4");

        System.out.println(person4);
    }

}
