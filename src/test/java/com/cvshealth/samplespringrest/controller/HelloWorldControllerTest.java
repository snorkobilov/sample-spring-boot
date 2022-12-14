package com.cvshealth.samplespringrest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldControllerTest {
    HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    void helloWorld() {
        String expectedWord = helloWorldController.helloWorld();
        assertEquals("HELLO WORLD", expectedWord);
    }
}
