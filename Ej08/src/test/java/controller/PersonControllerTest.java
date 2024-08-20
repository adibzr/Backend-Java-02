package controller;

import model.Person;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.PersonService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
@Mock: Se usa para mockear las dependencias del objeto de prueba
@InjectMocks: Crea una instancia del objeto bajo prueba y luego inyecta los mocks.
MockitoAnnotations.openMocks(this): Inicializa los mocks
when(...).thenReturn(...): Define el comportamiento de los métodos mockeados.
verify(...): Verifica que un método mockeado se haya llamado el número de veces especificado.

*/

public class PersonControllerTest {

    @Mock
    private PersonService personService;

    @InjectMocks
    private PersonController personController;

    public PersonControllerTest() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void should_returnPerson_when_validIdIsSent() {

        //given
        Person person = new Person();
        person.setId(1L);
        person.setNombreApellido("Marty McFly");
        String expectedResult = "Marty McFly";

        //when
        when(personService.findPersonById(1L)).thenReturn(person);
        Person response = personController.getPersonById(1L);
        String actualResult = response.getNombreApellido();

        //then
        assertEquals(expectedResult, actualResult);
        verify(personService, times(1)).findPersonById(1L);
    }

    @Test
    void should_savePerson_when_validPersonIsSent() {

        Person person2 = new Person();
        person2.setNombreApellido("Mario Gomez");
        String expectedResult = "Mario Gomez";

        when(personService.savePerson(person2)).thenReturn(person2);
        Person response = personController.createPerson(person2);
        String actualResult = response.getNombreApellido();

        assertEquals(expectedResult, actualResult);
        verify(personService, times(1)).savePerson(person2);
    }

    @Test
    void should_removePerson_when_validIdIsSent() {

        doNothing().when(personService).deletePerson(1L);

        personController.deletePerson(1L);

        verify(personService, times(1)).deletePerson(1L);
    }

    @Test
    void should_getPeople_when_getAllPersons() {

        List<Person> people = Arrays.asList(
                new Person(1L,"Checo Perez", null, "Mexico"),
                new Person(2L,"Lewis Hamilton", null, "Reino Unido"),
                new Person(3L,"Carlos Sainz", null, "España"));
        Integer expectedResult = 3;

        when(personService.findAllPersons()).thenReturn(people);
        List<Person> result = personController.getPeople();

        Integer actualResult = result.size();
        assertEquals(expectedResult, actualResult);
    }
}
