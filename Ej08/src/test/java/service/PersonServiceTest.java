package service;

import model.Person;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import repository.PersonRepositoryImpl;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

/**

any(Class<T> type): Cualquier valor de un tipo específico.
anyLong(): Cualquier long o Long.
*/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonServiceTest {

    @Mock
    private PersonRepositoryImpl personRepository;

    @InjectMocks
    private PersonService personService;

    public PersonServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Order(1)
    void should_findPerson_when_validIdIsSent(){

        Person person = new Person();
        person.setNombreApellido("Checo Perez");
        String expectedResult = "Checo Perez";

        when(personRepository.findById(anyLong())).thenReturn(Optional.of(person));
        Person foundPerson = personService.findPersonById(55L);
        String actualResult = foundPerson.getNombreApellido();

        assertNotNull(foundPerson);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @Order(2)
    void should_savePerson_when_validPersonIsSent() {
        Person person2 = new Person();
        person2.setNombreApellido("Julia D");
        String expectedResult = "Julia D";

        when(personRepository.save(any(Person.class))).thenReturn(person2);
        Person savedPerson = personService.savePerson(person2);
        String actualResult = savedPerson.getNombreApellido();

        assertNotNull(savedPerson);
        assertEquals(expectedResult, actualResult);
        verify(personRepository, times(1)).save(any(Person.class));
    }
}
