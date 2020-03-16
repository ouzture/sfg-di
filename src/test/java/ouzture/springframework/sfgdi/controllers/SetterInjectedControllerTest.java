package ouzture.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ouzture.springframework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}