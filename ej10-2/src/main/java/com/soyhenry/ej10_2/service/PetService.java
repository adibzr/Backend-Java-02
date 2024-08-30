package com.soyhenry.ej10_2.service;

import com.soyhenry.ej10_2.model.Pet;
import com.soyhenry.ej10_2.repository.PetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    PetDao petDao;

    public List<Pet> getAllPets() {
        return petDao.getAll();

    }

    public Pet getPetById(long id) {
        return petDao.getById(id);
    }

    public void addPet(Pet pet) {
        petDao.add(pet);
    }

    public void deletePet(Pet pet) {
        petDao.del(pet);
    }

    public void updPet(Pet pet) {
        petDao.upd(pet);
    }
}
