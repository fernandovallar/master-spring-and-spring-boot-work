package com.course.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimpleSpringContextLauncherApplication {
    
    public static void main(String[] args){
        
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }       
        
    }
}
