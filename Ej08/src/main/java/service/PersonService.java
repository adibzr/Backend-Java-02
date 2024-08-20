package service;

import java.util.List;
import model.Person;
import repository.PersonRepositoryImpl;

public class PersonService {

    private final PersonRepositoryImpl personRepository;

    public PersonService(PersonRepositoryImpl personRepository){

        this.personRepository = personRepository;

    }

    public Person findPersonById(Long id) {
        System.out.println("Person service - findPersonById");
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }

    public Person savePerson(Person person) {
        System.out.println("savePerson on Service");
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        System.out.println("Delete Person on PersonService");
        personRepository.deleteById(id);
    }

    public List<Person> findAllPersons() {
        System.out.println("FindAllPersons on PersonService");
        return personRepository.findAll();
    }
}
