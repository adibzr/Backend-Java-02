package com.soyhenry.ej10.repository;

import com.soyhenry.ej10.model.Animal;
import org.springframework.stereotype.Repository;

/*
@Repository Utilizada para marcar clases de acceso a datos (por ejemplo, clases de repositorio de Spring Data).
es una especialización de @Component.
 */

@Repository
public class AnimalRepository {
    public Animal getAnAnimal() {
        Animal animal = new Animal("Perro", "Bobby");
        return animal;
    }
}
