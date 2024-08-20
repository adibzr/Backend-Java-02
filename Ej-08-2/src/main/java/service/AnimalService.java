package service;

import model.Animal;
import repository.AnimalRepository;


public class AnimalService {

    private AnimalRepository animalRepository = new AnimalRepository();

    public Animal getById() {
        System.out.println("AnimalService - getByiD");
        return animalRepository.getAnimalById();
    }
}
