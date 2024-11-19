package com.example.learn_spring.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("Dependency injected");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Cleaning up");
    }

}
@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Dependency is ready");
    }
//    public SomeDependency() {
//        System.out.println("Dependency created");
//    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------------------");
        context.close();
    }
}
