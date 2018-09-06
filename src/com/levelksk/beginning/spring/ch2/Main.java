package com.levelksk.beginning.spring.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //基于java的配置创建和使用Spring容器
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);

        //基于xml配置
//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("ch2-beans.xml");
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        //基于java的注解配置 优先使用
//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("ch2-beans.xml");
//        AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);
//        Account account1 = applicationContext.getBean("account1", Account.class);
//        Account account2 = applicationContext.getBean("account2", Account.class);
//        System.out.println("Before money transfer");
//        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
//        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
//        System.out.println("Account 1 balance :" + account1.getBalance());
//        System.out.println("Account 2 balance :" + account2.getBalance());

//        accountService.transferMoney(1, 2, 5.0);
//
//        System.out.println("After money transfer");
//        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
//        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
//        System.out.println("Account 1 balance :" + account1.getBalance());
//        System.out.println("Account 2 balance :" + account2.getBalance());
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Configuration1.class, Configuration2.class);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo.getName());
    }
}
