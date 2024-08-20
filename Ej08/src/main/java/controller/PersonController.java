package controller;

import repository.PersonRepositoryImpl;
import service.PersonService;
import model.Person;

import java.util.List;


public class PersonController {

    private PersonService personService = new PersonService(new PersonRepositoryImpl());


    public Person getPersonById(Long id) {

        System.out.println("getPerson");
        Person person = personService.findPersonById(id);
        return person;
    }


    public Person createPerson(Person person) {

        System.out.println("Save Person");
        Person savedPerson = personService.savePerson(person);
        return savedPerson;
    }

    public void deletePerson( Long id) {

        System.out.println("Delete Person");
        personService.deletePerson(id);

    }

    public List<Person> getPeople(){

        System.out.println("finding people");
        return personService.findAllPersons();
    }

}
