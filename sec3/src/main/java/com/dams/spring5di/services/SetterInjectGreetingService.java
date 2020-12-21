package com.dams.spring5di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
