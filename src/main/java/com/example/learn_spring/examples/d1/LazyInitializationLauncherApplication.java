package com.example.learn_spring.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Init Logic - from B");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);


        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Init complete");

//        context.getBean("classB");
        System.out.println(context.getBean("classB").toString());

    }
}
