package com.soyhenry.ej10.controller;

import com.soyhenry.ej10.model.Animal;
import com.soyhenry.ej10.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Controller / @RestController: Especialización de @Component que se usa para clases que manejan solicitudes HTTP.

@Autowired: Habilita la inyección de dependencias. El contenedor de Spring inyecta la dependencia requerida en ese punto.

La Inversión de Control (IoC) es un principio de diseño que invierte el flujo de control en un programa.
En lugar de que el código de la aplicación controle el flujo, el control se delega al contenedor de IoC.
En el contexto de Spring, el contenedor de IoC es responsable de crear, configurar y gestionar el ciclo de vida de los objetos (beans).

Inyección de Dependencias (DI) es un patrón que se deriva del principio IoC.
DI es la técnica que el contenedor de IoC de Spring utiliza para gestionar las dependencias de los objetos.
En lugar de que un objeto cree sus propias dependencias, estas se proporcionan desde el exterior, generalmente por el contenedor de Spring.

 */

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping(value="/")
    public Animal getAnAnimal(){
        return animalService.getAnAnimal();
    }
}
