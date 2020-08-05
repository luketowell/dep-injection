package com.luketowell.depinjection.controllers;

import com.luketowell.depinjection.services.GreetingService;
import com.luketowell.depinjection.services.PrimaryGreetingServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
