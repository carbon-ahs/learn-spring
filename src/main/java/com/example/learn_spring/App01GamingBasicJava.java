package com.example.learn_spring;


import com.example.learn_spring.game.GameRunner;
import com.example.learn_spring.game.MarioGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {


        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}