package com.springprojects.springdi.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {

    public String sayGreeting();

}
