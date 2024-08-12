import pair.Pair;
import pair.PairImpl;
import point.Point;
import point.PointDouble;
import point.PointInteger;


public class App {
    public static void main(String[] args) {
        System.out.println("HW05 - Generics");

/*
        System.out.println("Generic class");
        GenericClass<String> stringBox = new GenericClass<>();
        stringBox.setContent("Hello");
        System.out.println(stringBox.getContent());

        GenericClass<Integer> intBox = new GenericClass<>();
        intBox.setContent(123);
        System.out.println(intBox.getContent());
*/



/*
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        GenericMethod.printArray(intArray);
        GenericMethod.printArray(stringArray);

*/
/*
        System.out.println("Point");
        Point p1 = new PointInteger();
        p1.setX(31);
        p1.setY(44);
        System.out.println(p1.getCoordinates());
        Point p2 = new PointDouble();
        p2.setX(45.4);
        p2.setY(33.9);
        System.out.println(p2.getCoordinates());


        System.out.println("Point");
        point2.Point p3 = new point2.PointInteger(45,18,72);
        System.out.println(p3);
        point2.Point p4 = new point2.PointDouble(75.0, 1578.3,0.0);
        System.out.println(p4);

*/


        System.out.println("Pair");
        Pair<String, Integer> one = new PairImpl<>("One", 1);
        System.out.println("Key: " + one.getKey() + ", Value: " + one.getValue());
        Pair<Double, Integer> two = new PairImpl<>(4.55, 2);
        System.out.println("Key: " + two.getKey() + ", Value: " + two.getValue());




        /*
        BoundedTypeParameter.printNumber(123);
        BoundedTypeParameter.printNumber(45.67);
        BoundedTypeParameter.printNumber(8.90f);
*/

    }
}
