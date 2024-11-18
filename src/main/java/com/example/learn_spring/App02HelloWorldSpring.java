package com.example.learn_spring;


import com.example.learn_spring.game.GameRunner;
import com.example.learn_spring.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // 1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the  things that we want Spring to manage
        // HelloWorldConfiguration - @Configuration
        // name1 - @Bean

        // 3: Retrieve beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
//        System.out.println(context.getBean(Person.class));

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println); // method ref - functional programming
    }

    // step 15

}