package repository;

import model.Animal;

public class AnimalRepository {
    public Animal getAnimalById() {

        Animal animal = new Animal();
        System.out.println("Animal repository - get by id");
        return animal;
    }
}
