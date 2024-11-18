package com.example.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean(name = "name")
    public String name() {
        return "Shehanuk";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        var person = new Person("Shehanuk", 77);
        return person;
    }

    @Bean
    public Person person2() {
        var person = new Person(name(), age());
        return person;


    }
}
