package com.mezo.trainin.Controllers;

import com.mezo.trainin.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHey();
    }
}
