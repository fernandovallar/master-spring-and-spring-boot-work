package com.course.learnspringframework;

import com.course.learnspringframework.game.GameRunner;
import com.course.learnspringframework.game.MarioGame;
import com.course.learnspringframework.game.SuperContraGame;
import com.course.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args){
        
        var game = new SuperContraGame();
        //var game = new MarioGame();
        //var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
    
}
