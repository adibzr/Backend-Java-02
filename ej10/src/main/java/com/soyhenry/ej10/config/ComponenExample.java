package com.soyhenry.ej10.config;


import org.springframework.stereotype.Component;

/**
@Component se utiliza para marcar una clase como un componente de Spring.
Spring escanea en busca de clases marcadas con @Component y las registrará como beans en el contexto de Spring.
 */

@Component
public class ComponenExample {

    public String addNumbers (double number1, double number2){

        return String.valueOf(number1 + number2);
    }

    public String subNumbers (double number1, double number2){

        return String.valueOf(number1 + number2);
    }

}
