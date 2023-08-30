package com.course.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    
    public static void main(String[] args){

        //1 - Launch a Spring context 
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2 - Configure the things that we want Spring to manage
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3 - Retrieving Beans managed by Spring 
       System.out.println(context.getBean("name"));
    }
}
