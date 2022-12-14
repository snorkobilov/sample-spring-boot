package com.cvshealth.samplespringrest.integration;

import com.cvshealth.samplespringrest.controller.HelloWorldController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void returnsHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello-world"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HELLO WORLD"));
    }
}
