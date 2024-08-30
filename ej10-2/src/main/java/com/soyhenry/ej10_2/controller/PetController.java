package com.soyhenry.ej10_2.controller;

import com.soyhenry.ej10_2.model.Pet;
import com.soyhenry.ej10_2.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping
    public List<Pet> getAllPets(){

        List<Pet> petList = petService.getAllPets();

        for (Pet pet : petList) {
            String customerId = pet.getId().toString();
            Link selfLink = linkTo(PetController.class).slash(customerId).withSelfRel();
            pet.add(selfLink);
            }

        return petList;
    }

    @GetMapping(value = "/{idPet}")
    public Pet getPetById(@PathVariable("idPet") long id){

        return petService.getPetById(id);

    }

    @PostMapping(value="/")
    public void addPet(@RequestBody Pet pet){
        petService.addPet(pet);
    }

    @DeleteMapping(path = "/")
    public void deletePet(@RequestBody Pet pet){
        petService.deletePet(pet);
    }

    @PutMapping(path = "/")
    public void updPet(@RequestBody Pet pet){
        petService.updPet(pet);
    }

    @PatchMapping(path = "/")
    public void updPet2(@RequestBody Pet pet){
        petService.updPet(pet);
    }
}
