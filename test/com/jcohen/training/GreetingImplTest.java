package com.jcohen.training;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.com.jcohen.training.Greeting;
import main.com.jcohen.training.GreetingImpl;

public class GreetingImplTest {
    Greeting greeting;
    
    
    @BeforeEach
    public void setup(){
        greeting = new GreetingImpl();
    }

    @Test
    public void greetShouldReturnAValidOutput(){
        String result = greeting.greet("Jonathan");
        assertNotNull(result);
        assertEquals("Hello, Jonathan", result);
    }

    @Test
    public void greetShouldReturnAnExceptionForNameIsNull(){
        assertThrows(IllegalArgumentException.class, () -> {
        greeting.greet(null);
        }, "Name required for completion.");
    }

    @Test
    public void greetShouldReturnAnExceptionForNameIsBlank(){
        assertThrows(IllegalArgumentException.class, () -> {
        greeting.greet("");
        }, "Name required for completion.");
    }

    @AfterEach
    public void teardown(){
        greeting = null;
    }
        


}
