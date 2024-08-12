package streams;

import model.User;

import java.util.*;


public class StreamsExample {

    //public static List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    //Filtra los elementos del stream según un Predicate
    public static void filter(List<String> list){
        list.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }

    //Transforma cada elemento del stream aplicando una función de mapeo.
    public static void map(List<String> list){
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

//    Transforma cada elemento en un stream de elementos y luego aplana estos streams en un único stream.
    public static void flatMap(){
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    //Elimina los elementos duplicados del stream.
    public static <T> void distinct(List<T> list){
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    //Ordena los elementos del stream en su orden natural
    public static <T> void sorted(List<T> list){
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void sortedReverse(List<String> list){
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    //Realiza una acción para cada elemento del stream y devuelve un nuevo stream con los mismos elementos
    public static void peek(List<String> list){
        list.stream()
                .peek(name -> System.out.println("Elemento original: " + name))
                .map(String::toUpperCase)
                .forEach(element -> System.out.println("Elemento tranformado: " + element));
    }

    //Limita el número de elementos en el stream al máximo especificado.
    public static void limit(List<String> list){
        list.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    //Omite los primeros n elementos del stream
    public static void skip(List<String> list){
        list.stream()
                .skip(3)
                .forEach(System.out::println);
    }



    public static void printWithFor(List<User> list){
        long startTime = System.nanoTime(); //System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("printWithFor: " + duration + " nanoseconds");
    }

    public static void printWithForEach(List<User> list){
        for (User element : list) {
            System.out.println(element);
        }
    }

    public static void printWithWhile(List<User> list){
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printWithStream(List<User> list){
        long startTime = System.nanoTime();
        list.stream().forEach(System.out::println);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("printWithStream: " + duration + " nanoseconds");
    }

    public static void processWithFor(List<User> list){
        long startTime = System.currentTimeMillis();

        List<User> filteredList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getFirstName().startsWith("M")) {
                filteredList.add(user);
            }
        }

        filteredList.sort(Comparator.comparingLong(User::getId));

        for (User user : filteredList) {
            System.out.println(user);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("processWithFor: " + duration + " milis");
    }

    public static void processWithStream(List<User> list){
        long startTime = System.currentTimeMillis();
        list.stream()
                .filter(user -> user.getFirstName().startsWith("M"))
                .sorted(Comparator.comparing(User::getId))
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("processWithStream: " + duration + " milis");
    }


}
