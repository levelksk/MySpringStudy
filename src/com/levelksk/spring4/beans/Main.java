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

    }

}
