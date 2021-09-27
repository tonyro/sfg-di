package by.rouba.sfgdi.controllers;

import by.rouba.sfgdi.services.ConstructorGreetingImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorInjectedControllerTest {
    private static final String STRING = "Hello World -- Constructor";

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingImpl());
    }

    @Test
    void getGreeting() {
        assertEquals(controller.getGreeting(), STRING);
    }
}