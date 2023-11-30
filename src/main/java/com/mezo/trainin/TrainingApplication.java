package com.mezo.trainin;

import com.mezo.trainin.Controllers.ConstructorInjectionController;
import com.mezo.trainin.Controllers.MyController;
import com.mezo.trainin.Controllers.PropertyInjectionController;
import com.mezo.trainin.Controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(TrainingApplication.class, args);

        MyController primaryGreeting = (MyController) ctx.getBean("myController");
        System.out.print("primary : ");
        primaryGreeting.sayHello();

        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.print("Setter : ");
        setterInjectionController.sayHello();

        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.print("property : ");
        propertyInjectionController.sayHello();

        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
        System.out.print("constructor : ");
        constructorInjectionController.sayHello();
    }

}
