package com.luketowell.depinjection.controllers;

import com.luketowell.depinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("I18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
