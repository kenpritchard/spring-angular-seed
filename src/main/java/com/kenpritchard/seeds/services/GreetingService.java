package com.kenpritchard.seeds.services;

import org.springframework.stereotype.Component;

import com.kenpritchard.seeds.domain.Greeting;

@Component
public class GreetingService {
    
	public Greeting getGreeting(String salutation, String name) {
	    Greeting greeting = new Greeting();
	    greeting.setName(name);
	    greeting.setSalutation(salutation);
        return greeting;
	}

    public Greeting postGreeting(Greeting theGreeting) {
        return theGreeting;
    }
}
