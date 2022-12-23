package com.cvshealth.samplespringrest.controller;

import com.cvshealth.samplespringrest.repository.HelloWorldEntity;
import com.cvshealth.samplespringrest.repository.HelloWorldRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloWorldControllerTest {

    @Mock
    HelloWorldRepository helloWorldRepository;

    HelloWorldController helloWorldController;

    @BeforeEach
    void setUp() {
        helloWorldController = new HelloWorldController(helloWorldRepository);
    }

    @Test
    void helloWorld() {
        when(helloWorldRepository.findById(1L)).thenReturn(Optional.of(new HelloWorldEntity(1L, "HELLO WORLD")));
        String expectedWord = helloWorldController.helloWorld();
        assertEquals("HELLO WORLD", expectedWord);
    }
}
