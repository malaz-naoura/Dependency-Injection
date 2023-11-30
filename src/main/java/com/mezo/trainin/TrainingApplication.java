package com.mezo.trainin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(TrainingApplication.class, args);
        MyController greeting= (MyController) ctx.getBean("myController");

        greeting.sayHello();
    }

}
