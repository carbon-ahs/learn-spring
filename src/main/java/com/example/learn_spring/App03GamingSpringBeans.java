package com.example.learn_spring;


import com.example.learn_spring.game.GameRunner;
import com.example.learn_spring.game.GamingConsole;
import com.example.learn_spring.game.MarioGame;
import com.example.learn_spring.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.learn_spring.game")
public class App03GamingSpringBeans {

    public static void main(String[] args) {
        // 1: Launch a Spring Context
        // GamingConfiguration - @Configuration
        var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);

        // 2: Configure the  things that we want Spring to manage
        // name1 - @Bean
        //context.getBean(GamingConsole.class).up(); // getting by type(GamingConsole.class)

        context.getBean(GameRunner.class).run();


        // 3: Retrieve beans managed by Spring
//        var game = new MarioGame();
//        var game = new SuperContraGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();

    }

}