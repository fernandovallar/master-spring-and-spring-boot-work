package com.course.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQUalifier")
public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("up");
    }

    public void down(){
         System.out.println("sit");
    }

    public void left(){
        System.out.println("left");
    }

    public void right(){
         System.out.println("shoot");
    }
}

