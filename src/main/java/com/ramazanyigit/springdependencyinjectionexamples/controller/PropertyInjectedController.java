package com.ramazanyigit.springdependencyinjectionexamples.controller;

import com.ramazanyigit.springdependencyinjectionexamples.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
