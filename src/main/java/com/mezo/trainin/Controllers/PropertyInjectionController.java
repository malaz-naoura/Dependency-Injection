package com.mezo.trainin.Controllers;

import com.mezo.trainin.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    private GreetingService greetingService;


    public void sayHello(){
        greetingService.sayHey();
    }
}
