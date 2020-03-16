package ouzture.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ouzture.springframework.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}