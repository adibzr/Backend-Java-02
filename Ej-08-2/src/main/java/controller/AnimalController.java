package controller;

import model.Animal;
import service.AnimalService;

public class AnimalController {

    private AnimalService animalService = new AnimalService();

    public Animal getAnimalById(Long id){
        System.out.println("Animal Controller - getById");
        return  animalService.getById();

    }
}
