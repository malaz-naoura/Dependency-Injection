package com.mezo.trainin.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public void sayHey() {
        System.out.println("Hello Folks - Primary 🙋‍♂️");
    }
}
