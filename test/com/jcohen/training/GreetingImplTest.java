package com.jcohen.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GreetingImplTest {

       Greeting greeting = new GreetingImpl();

    @Test
    public void testGreet() {
        //Instantiate an instance of class(GreetingImpl)
     
        //attaching the expected return value of the greet function to a string variable called result.
        String result = greeting.greet("Jonathan");
        assertNotNull(result);
        assertEquals("Hello, Jonathan", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsNull(){
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsBlank(){
        greeting.greet("");
    }
}
