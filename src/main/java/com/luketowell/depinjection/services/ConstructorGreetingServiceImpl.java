package com.luketowell.depinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hello World! - Constructor";
    };
}
