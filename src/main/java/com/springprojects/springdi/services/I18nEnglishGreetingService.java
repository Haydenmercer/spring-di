package com.springprojects.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nGreetingService")
@Profile({"EN", "default"})
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "HELLO IN ENGLISH";
    }
}
