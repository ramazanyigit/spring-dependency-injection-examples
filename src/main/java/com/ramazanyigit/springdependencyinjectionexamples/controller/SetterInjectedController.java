package com.ramazanyigit.springdependencyinjectionexamples.controller;

import com.ramazanyigit.springdependencyinjectionexamples.service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
