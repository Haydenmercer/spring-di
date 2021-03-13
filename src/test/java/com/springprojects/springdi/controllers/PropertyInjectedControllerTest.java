package com.springprojects.springdi.controllers;

import com.springprojects.springdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService(); //not recommended - property injection
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}