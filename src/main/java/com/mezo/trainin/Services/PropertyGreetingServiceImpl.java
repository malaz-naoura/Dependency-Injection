package com.mezo.trainin.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public void sayHey() {
        System.out.println("Hello Folks - Property 🙋‍♂️");
    }
}
