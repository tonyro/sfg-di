package by.rouba.sfgdi.config;

import by.rouba.sfgdi.services.pets.PetService;
import by.rouba.sfgdi.services.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }
}
