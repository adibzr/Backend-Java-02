package controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.AnimalService;

/**
 @Mock: Se usa para mockear las dependencias del objeto de prueba
 @InjectMocks: Crea una instancia del objeto bajo prueba y luego inyecta los mocks.
 MockitoAnnotations.openMocks(this): Inicializa los mocks
 when(...).thenReturn(...): Define el comportamiento de los métodos mockeados.
 verify(...): Verifica que un método mockeado se haya llamado el número de veces especificado.

 */

public class AnimalControllerTest {


     @Mock
    private AnimalService animalService;

    @InjectMocks
    private AnimalController animalController;

    public AnimalControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_retrunAnAnimal_when_anIdIsSent(){
        System.out.println("test");
    }

/*
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
    */
     



}
