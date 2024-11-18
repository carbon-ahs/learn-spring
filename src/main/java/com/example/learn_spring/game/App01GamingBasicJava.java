package com.example.learn_spring.game;


public class App01GamingBasicJava {

    public static void main(String[] args) {


        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}