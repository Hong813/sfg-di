package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

import java.lang.management.GarbageCollectorMXBean;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    }
