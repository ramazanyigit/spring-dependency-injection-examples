package com.ramazanyigit.springdependencyinjectionexamples.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - From the PRIMARY Bean";
    }
}
