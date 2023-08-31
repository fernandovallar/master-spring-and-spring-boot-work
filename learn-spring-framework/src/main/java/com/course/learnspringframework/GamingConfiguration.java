package com.course.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.course.learnspringframework.game.GameRunner;
import com.course.learnspringframework.game.GamingConsole;
import com.course.learnspringframework.game.PacmanGame;
import com.course.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
    
    @Bean 
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean 
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
