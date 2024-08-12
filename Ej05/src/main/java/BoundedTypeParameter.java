public class BoundedTypeParameter {

    public static <T extends Number> void printNumber(T number) {
        System.out.println("Number: " + number);
    }
}
