package com.example.learn_spring;

import com.example.learn_spring.game.GameRunner;
import com.example.learn_spring.game.GamingConsole;
import com.example.learn_spring.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class GamingConfiguration {

//    @Bean
//    public GamingConsole game() {
//        var game = new MarioGame();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole game) { // passing bean by parameter
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
//}
