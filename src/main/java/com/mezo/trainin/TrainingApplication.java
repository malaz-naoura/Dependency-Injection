package com.mezo.trainin;

import com.mezo.trainin.Controllers.*;
import com.mezo.trainin.dataSource.FakeDataSource;
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

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        i18nController.sayHello();

        System.out.println("********************************************************************");
        System.out.println("***************************Property Config *************************");
        System.out.println("********************************************************************");

        FakeDataSource fakeDataSource=ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);
    }

}
