package com.dams.spring5di.controllers;

import com.dams.spring5di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingServiceImpl = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.sayHello());
    }
}