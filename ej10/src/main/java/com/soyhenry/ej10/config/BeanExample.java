package com.soyhenry.ej10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
@Bean genera un componente reutilizable que se puede llamar desde cualquier lado de la aplicación
bean vs component:
    @Bean se utiliza generalmente para declarar un método que devuelve un bean.
    @Component se utiliza para marcar una clase como bean.
    @Bean se usa generalmente en clases de configuración
    @Component se usa generalmente en clases de componentes.
    @Bean permite personalizar el nombre, el alcance y la inicialización del bean
    @Component se basa en la configuración predeterminada u otras anotaciones
 */

@Configuration
public class BeanExample {

    @Bean
    public String AppInfo(){
        return "App Name:" + "Demo Spring" + "\n" + "App Version: 1.0.0";
    }
}
