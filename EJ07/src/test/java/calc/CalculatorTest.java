package calc;


import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
                Ejemplo de Unit Test - Recomendaciones:

    Usar nomenclatura should_expectedBehavior_when_stateUnderTest
    Replicar la estructura de los packages en el árbol de test
    Utilizar constantes para colocar valores fijos
    Utilizar método setUp antotado como @BeforeAll para generar los objetos comunes.
    Given, When, Then (AAA) - Entrada, Ejecución, Salida
    Usar prefijos expectedXX y actualXX para los asserts  */

public class CalculatorTest {

    private static final Integer LOWER_VALUE = Integer.valueOf(1000);
    private static final Integer HIGHER_VALUE = Integer.valueOf(5000);

    private static Calculator<Number> calculator;

    @BeforeAll
    public static void setUp(){
        System.out.println("Init Calculator");
        calculator = new Calculator<>();
    }

//    @BeforeEach
//    public void setUpEach() {
//        System.out.println("Before each test case");
//    }




    @Test
    void should_addIntegers_when_receiveTwoIntegers() {
        //given
        Integer expectedResult = LOWER_VALUE + HIGHER_VALUE;

        //when
        Integer actualResult = calculator.add(LOWER_VALUE , HIGHER_VALUE).intValue();

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_addDoubles_when_receiveTwoDoubles() {

        Double expectedResult = LOWER_VALUE.doubleValue() + HIGHER_VALUE;
        Double actualResult = calculator.add(LOWER_VALUE , HIGHER_VALUE);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_addFloats_when_receiveTwoFloats() {

        Float expectedResult = LOWER_VALUE.floatValue() + HIGHER_VALUE;
        Float actualResult = calculator.add(LOWER_VALUE , HIGHER_VALUE).floatValue();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_addLongs_when_receiveTwoLongs() {

        Long expectedResult = LOWER_VALUE.longValue() + HIGHER_VALUE;
        Long actualResult = calculator.add(LOWER_VALUE , HIGHER_VALUE).longValue();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_subtractIntegers_when_receive_TwoIntegers() {

        Integer expectedResult = LOWER_VALUE - HIGHER_VALUE;
        Integer actualResult = calculator.subtract(LOWER_VALUE , HIGHER_VALUE).intValue();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void should_subtractDoubles_when_receive_TwoDoubles() {
        //No
        assertEquals(4.5, calculator.subtract(7.5, 3.0));
    }

    @Test
    void should_subtractFloats_when_receive_TwoFloats() {
        //SI
        Float expectedResult = LOWER_VALUE.floatValue() - HIGHER_VALUE;
        Float actualResult = calculator.subtract(LOWER_VALUE , HIGHER_VALUE).floatValue();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_subtract_Longs_when_receive_TwoLongs() {
        assertEquals(-5.0, calculator.subtract(5000000000L, 5000000005L));
    }

    @Test
    void testMultiplyIntegers() {
        assertEquals(15.0, calculator.multiply(5, 3));
    }

    @Test
    void testMultiplyDoubles() {
        assertEquals(22.5, calculator.multiply(7.5, 3.0));
    }

    @Test
    void testMultiplyFloats() {
        assertEquals(10.0, calculator.multiply(2.5f, 4.0f));
    }

    @Test
    void testMultiplyLongs() {
        assertEquals(25000000000.0, calculator.multiply(5000000000L, 5));
    }

    @Test
    void testDivideIntegers() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void testDivideDoubles() {
        assertEquals(2.5, calculator.divide(5.0, 2.0));
    }

    @Test
    void testDivideFloats() {
        assertEquals(2.5, calculator.divide(5.0f, 2.0f));
    }

    @Test
    void testDivideLongs() {
        assertEquals(2.0, calculator.divide(10L, 5L));
    }

    @Test
    void should_ThrowArithmeticException_when_dividByZero() {

        String expectedResult = "Cannot divide by zero.";

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(HIGHER_VALUE, 0));
        String actualResult = exception.getMessage();

        assertEquals(expectedResult,actualResult );
    }

//    @AfterEach
//    public void shutDownEach(){
//        System.out.println("After each test case");
//    }

    @AfterAll
    public static void shutDown(){
        System.out.println("Finish test cases");
    }
}
