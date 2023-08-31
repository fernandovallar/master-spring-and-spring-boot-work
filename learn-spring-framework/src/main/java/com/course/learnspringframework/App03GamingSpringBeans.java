package com.course.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.course.learnspringframework.game.GameRunner;
import com.course.learnspringframework.game.GamingConsole;
import com.course.learnspringframework.game.MarioGame;
import com.course.learnspringframework.game.SuperContraGame;
import com.course.learnspringframework.game.PacmanGame;

public class App03GamingSpringBeans {
    public static void main(String[] args){
        
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
        

        
    }
}
