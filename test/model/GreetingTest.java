/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class GreetingTest {

    public GreetingTest() {
    }

    /**
     *
     */
    @Test
    public void testGetValue() {
        Greeting greeting = new Greeting("My message");
        assertEquals("Error",
                "My message",
                greeting.getValue());

    }

    /**
     * Test of setValue method, of class Greeting
     */
    //@Test
    public void testSetValue() {
        Greeting greeting = new Greeting();
        greeting.setValue("Another message");
        assertEquals("Error",
                "Another message",
                greeting.getValue());
    }

}
