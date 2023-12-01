package com.mezo.trainin.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService {
    @Override
    public void sayHey() {
        System.out.println("Hello from English");
    }
}
