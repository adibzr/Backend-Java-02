package repository;

import model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Optional<Person> findById(Long id);
    Person save(Person person);
    void deleteById(Long id);
    List<Person> findAll();
}