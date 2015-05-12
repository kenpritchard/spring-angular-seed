package com.kenpritchard.seeds.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.kenpritchard.seeds.domain.Greeting;
import com.kenpritchard.seeds.services.GreetingService;

@RestController
class HomeController {

	static final Logger logger = Logger.getLogger(HomeController.class.getName());

	@Autowired
	private GreetingService gloveService;

	@RequestMapping(value = "/greetings/{salutation}/{name}", method = RequestMethod.GET)
	Greeting getGreeting( @PathVariable String salutation, @PathVariable String name) {
		HomeController.logger.trace(String.format("Received GET request for: %s, %s", salutation, name));
		Greeting result = this.gloveService.getGreeting(salutation, name);
		HomeController.logger.trace(String.format("Returning: %s", result));
		return result;
	}

    @RequestMapping(value = "/greetings", method = RequestMethod.POST)
    Greeting postGreeting(@RequestBody Greeting greeting) {
        HomeController.logger.trace(String.format("Received POST request for: %s, %s", greeting.getSalutation(), greeting.getName()));
        Greeting result = this.gloveService.postGreeting(greeting);
        HomeController.logger.trace(String.format("Returning: %s", result));
        return result;
    }
}
