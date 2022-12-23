package com.cvshealth.samplespringrest.repository;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HELLO_WORLD")
public class HelloWorldEntity {
    @Id
    private Long id;

    private String greeting;

    public HelloWorldEntity(Long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public HelloWorldEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
