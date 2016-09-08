package com.client.spring.support.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fe on 16/9/1.
 */
public class AppTest {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext);
    }
}
