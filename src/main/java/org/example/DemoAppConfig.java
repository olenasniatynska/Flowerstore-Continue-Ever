package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfig {
    @Bean
    String getData() {
        return "hello world";
    }
}
