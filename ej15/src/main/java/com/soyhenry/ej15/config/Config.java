package com.soyhenry.ej15.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public OpenAPI customOpenAPI(@Value("V1") String AppVersion){
        return new OpenAPI().info(new Info().title("Upskilling: backend-java-02- Ej JPA")
                .version(AppVersion)
                .description("API ejemplo de JPA enSpring con documentación con Swagger y Open API")
                .termsOfService("http://www.google.com")
                .license(new License().name("Apache 2.0").url("http://www.google.com")));
    }
}
