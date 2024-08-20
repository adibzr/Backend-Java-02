package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepositoryImpl implements PersonRepository{

    // implementación Dummy sin acceso a datos, no hay DAO ni Repository

    @Override
    public Optional<Person> findById(Long id) {
        System.out.println("simulate findById");
        return Optional.empty();
    }

    @Override
    public Person save(Person person) {
        System.out.println("simulate save Person");
        return person;
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("simulate delete Person with id " + id);

    }

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        System.out.println("simulate findAll");
        return people;
    }
}
