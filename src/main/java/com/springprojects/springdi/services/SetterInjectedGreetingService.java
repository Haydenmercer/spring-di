package com.springprojects.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

        @Override
        public String sayGreeting() {
            return "Hey World - Setter Injected";
        }
}
