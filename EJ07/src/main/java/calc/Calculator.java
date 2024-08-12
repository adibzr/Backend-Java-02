package calc;

public class Calculator<T extends Number> {

    private Long id;
    private String name;

    public Double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public Double pow(T num1){
        return num1.doubleValue() * num1.doubleValue();
    }
}
