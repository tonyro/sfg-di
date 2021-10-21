package by.rouba.sfgdi.controllers;

import by.rouba.sfgdi.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterInjectedControllerTest {
    private static final String STRING = "Hello World -- Setter";

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals(controller.getGreeting(), STRING);
    }
}