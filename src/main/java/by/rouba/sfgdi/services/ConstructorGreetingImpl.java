package by.rouba.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
