package com.example.learn_spring.examples.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------------------");
    }
}
