import model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaManager {

    public static void main(String[] args) {
        System.out.println("HW01");
        List<Person> people = new ArrayList<>();

        people.add(new Person("Victor M", LocalDate.of(1985,11,21), "Pescar, Programar, Vacaciones"));
        people.add(new Person("Jorge Lopez", LocalDate.of(2010,1,1), "Jugar, videojuegos, Programar, Futbol"));
        people.add(new Person("Checo Perez", LocalDate.of(1999,7,21), "Manejar, Vacaciones,Programar, Volar"));
        people.add(new Person("Maria Gomez", LocalDate.of(1981,7,21), "Vacaciones, Correr"));
/*
        people.stream()
                .filter(person -> person.getAge() > 18)
//                .filter(person -> person.getHobbies().toUpperCase().contains("PROGRAMAR"))
                .filter(person -> person.getHobbies().matches("(?i).*\\bprogramar\\b.*"))
                .forEach(System.out::println);

        System.out.println("HW02");
        List<String> personNames = people.stream()
                .map(Person::getFullName)
                .collect(Collectors.toList());

        personNames.forEach(System.out::println);

        System.out.println("HW03");
        people.stream()
                .limit(3)
                .forEach(person -> System.out.println("Name:" + person.getFullName() + " Age:" + person.getAge()));
*/
        System.out.println("HW04");
        people.stream()
                .forEach(person -> System.out.println("Name:" + person.getFullName()));
    }
}
