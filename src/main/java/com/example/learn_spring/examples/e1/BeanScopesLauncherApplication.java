package com.example.learn_spring.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {
    public NormalClass() {
        System.out.println("NormalClass");
    }
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
    public PrototypeClass() {
        System.out.println("PrototypeClass");
    }
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("--------------------------------------");
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
    }
}
