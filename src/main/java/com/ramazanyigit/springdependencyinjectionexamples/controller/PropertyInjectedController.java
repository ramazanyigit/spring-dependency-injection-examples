package com.ramazanyigit.springdependencyinjectionexamples.controller;

import com.ramazanyigit.springdependencyinjectionexamples.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
