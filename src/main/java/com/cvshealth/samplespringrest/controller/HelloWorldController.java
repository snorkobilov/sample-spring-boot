package com.cvshealth.samplespringrest.controller;

import com.cvshealth.samplespringrest.repository.HelloWorldEntity;
import com.cvshealth.samplespringrest.repository.HelloWorldRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldController(HelloWorldRepository helloWorldRepository1) {
        this.helloWorldRepository = helloWorldRepository1;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return helloWorldRepository.findById(1L)
                .map(HelloWorldEntity::getGreeting).orElseThrow();
    }
}
