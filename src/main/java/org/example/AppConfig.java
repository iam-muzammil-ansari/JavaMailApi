package org.example;

import org.example.objects.ObjectA;
import org.example.objects.ObjectB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmailService emailServiceBean() {
        return new EmailService();
    }

    @Bean
    public ObjectA objectA(ObjectB objectB) {
        return new ObjectA(objectB);
    }

    @Bean
    public ObjectB objectB() {
        return new ObjectB();
    }
}
