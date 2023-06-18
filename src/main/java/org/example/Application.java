package org.example;

import org.example.controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.getObjects());
    }
}
