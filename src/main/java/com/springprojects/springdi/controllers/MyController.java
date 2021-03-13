package com.springprojects.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello Earth");
        return "Hi Folks!";
    }

}
