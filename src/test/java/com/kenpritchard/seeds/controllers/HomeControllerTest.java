package com.kenpritchard.seeds.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kenpritchard.seeds.Application;
import com.kenpritchard.seeds.domain.Greeting;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class HomeControllerTest {
	
	@Autowired
	HomeController homeController;
	
	@Test
	public void testGetGreeting() {
	    String salutation = "hi";
        String name = "you";
        Greeting greeting = this.homeController.getGreeting(salutation, name);
        assertNotNull(greeting);
        assertEquals(salutation, greeting.getSalutation());
        assertEquals(name, greeting.getName());
	}
    
    @Test
    public void testPostGreeting() {
        String salutation = "hi";
        String name = "you";
        Greeting input = new Greeting();
        input.setSalutation(salutation);
        input.setName(name);
        Greeting greeting = this.homeController.postGreeting(input);
        assertNotNull(greeting);
        assertEquals(salutation, greeting.getSalutation());
        assertEquals(name, greeting.getName());
    }
}
