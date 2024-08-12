import java.util.*;

public class app {

    public static void main(String[] args) {

        System.out.println("HW03 - Interfacers y Collections");
        //Lista de lámparas
        List<Lamp> lamps = new ArrayList<>();

        Lamp lamp1 = new Lamp("Lamp1", true);
        Lamp lamp2 = new Lamp("Lamp2", true);
        Lamp lamp3 = new Lamp("Lamp3", false);
        Lamp lamp4 = new Lamp("Lamp4", true);
        Lamp lamp5 = new Lamp("Lamp5", false);

        lamps.add(lamp1);
        lamps.add(lamp5);
        lamps.add(lamp4);
        lamps.add(lamp3);
        lamps.add(lamp2);

        lamps.get(0).turnOff();
        lamps.get(2).turnOn();

        System.out.println("Listado de lámparas");
        for (Lamp lamp : lamps) {
            System.out.println(lamp.getName() + " - isTurnedOn: " + lamp.isTurnedOn());
        }

        Collections.sort(lamps, Comparator.comparing(Lamp::getName));

        System.out.println("Listado ordenado");
        for (Lamp lamp : lamps) {
            System.out.println(lamp.getName() + " - isTurnedOn: " + lamp.isTurnedOn());
        }

        // Buscar una lámpara específica por nombre
        String name = "Lamp3";
        int index = Collections.binarySearch(lamps, lamp3, Comparator.comparing(Lamp::getName));
        if (index >= 0) {
            System.out.println(name + " found at index: " + index);
        } else {
            System.out.println(name + " not found.");
        }

        //listado de productos
        Map<String, Double> products = new HashMap<>();
        products.put("TV Led", 149.99);
        products.put("HeadPhones", 51.49);
        products.put("Sound bar", 11.29);

        // Imprimir la lista de productos y precios
        System.out.println("List of products and prices:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }

        //intefaz funcional
        MathOperation suma = ((a, b) -> a+b);
        MathOperation resta = ((a, b) -> a-b);
        MathOperation producto = ((a, b) -> a*b);

        System.out.println("Operacion suma: " + suma.doOperation(3,5));
        System.out.println("Operacion resta: " + resta.doOperation(3,5));
        System.out.println("Operacion producto: " + producto.doOperation(3,5));

        MathOperationGenerics<Integer> suma2 = (a, b) -> a + b;
        MathOperationGenerics<Double> resta2 = (a, b) -> a - b;
        MathOperationGenerics<String> concat = (a, b) -> a + b;

        System.out.println("Operacion Generics suma: " + suma2.doOperation(3,5));
        System.out.println("Operacion Generics resta: " + resta2.doOperation(3.0,5d));
        System.out.println("Operacion Generics concat: " + concat.doOperation("Hola ","Mundo"));
    }
}
