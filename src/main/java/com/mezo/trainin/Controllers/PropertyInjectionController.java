package com.mezo.trainin.Controllers;

import com.mezo.trainin.Services.GreetingService;
import com.mezo.trainin.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    private GreetingService greetingService;


    public void sayHello(){
        greetingService.sayHey();
    }
}
