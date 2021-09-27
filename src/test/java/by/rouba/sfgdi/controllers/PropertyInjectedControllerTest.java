package by.rouba.sfgdi.controllers;

import by.rouba.sfgdi.services.PropertyGreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {
    private static final String STRING = "Hello World -- Property";

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyGreetingImpl();
    }

    @Test
    void getGreeting() {
        assertEquals(controller.getGreeting(), STRING);
    }
}