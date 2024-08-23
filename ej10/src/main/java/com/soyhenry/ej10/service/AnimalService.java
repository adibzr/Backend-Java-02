package com.soyhenry.ej10.service;

import com.soyhenry.ej10.model.Animal;
import com.soyhenry.ej10.repository.AnimalRepository;
import org.springframework.stereotype.Service;

/*
@Service Se utiliza para marcar clases de servicios en Spring.
Es una especialización de @Component.
Los servicios suelen contener la lógica de negocio de la aplicación.

Inyección de Dependencias a través de Constructores: Una de las mejores prácticas en Spring es usar inyección de dependencias a través de constructores.
Esto asegura que las dependencias se proporcionen en el momento de la creación del objeto, lo que facilita la escritura de código más seguro y la creación
de objetos inmutables.

En este caso se inyecta el repository en el constructor del service.
 */

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public Animal getAnAnimal() {
        return animalRepository.getAnAnimal();
    }
}
