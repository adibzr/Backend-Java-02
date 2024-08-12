import model.User;
import streams.StreamsExample;
import util.UserGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("HW04 - Streams");

        List<String> animals = Arrays.asList("Dog", "Cat", "Bear", "Eagle","Ant", "Tiger", "Chicken", "Ant", "Elephant", "Bat", "Monkey", "Zebra", "Lion");
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);


//        StreamsExample.filter(animals);
//        StreamsExample.map(animals);
//        StreamsExample.distinct(animals);
//        StreamsExample.sorted(animals);
//        StreamsExample.sorted(numbers);
//        StreamsExample.peek(animals);
//        StreamsExample.limit(animals);
//        StreamsExample.skip(animals);


        animals.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .forEach(System.out::println);






        List<User> users = new ArrayList<>();
        users = UserGenerator.generateUsers();


//        StreamsExample.printWithFor(users);     //83276125
        StreamsExample.printWithStream(users);  //69533709

//        StreamsExample.processWithStream(users); //19
//        StreamsExample.processWithFor(users);  //14
    }

}
