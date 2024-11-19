package com.example.learn_spring.examples.g1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessService {

    private DataService dataService;



    public DataService getDataService() {
        return dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}
@Component
class DataService {

}

@Configuration
@ComponentScan(basePackages = "com.example.learn_spring.examples.g1")
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println(context.getBean(BusinessService.class).getDataService());
        context.close();
    }
}
