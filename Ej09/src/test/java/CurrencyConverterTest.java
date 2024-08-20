import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

  /*
 * Test-Driven Development By Example -  Kent Beck
Made a list of the tests we knew we needed.
Generate test ignoring the details of JUnit for the moment.
Made the test compile with stubs.
Made the test run by committing horrible sins.
Gradually generalized the working code, replacing constants with variables, etc.
*/

    // currency converter
    // 1 USD = 0.85 EUR
    // 1 EUR = 162.76 YEN
    // 1 USD = 0,78 GBP
    // 1 USD = 937,96 ARS
    // 1 USD = 18,68 MXN

    @Test
    void should_convertUSDToEUR_when_validAmountIsSent(){

        CurrencyConversion currencyConversion = new CurrencyConversion();
        double actualValue = currencyConversion.convert(100D,"USD","EUR");
        double expectedValue = 85D;

        Assertions.assertEquals(expectedValue,actualValue);

    }

    @Test
    void should_convertUSDToEUR_when_validAmountIsSentAndIsLowerCase(){

        CurrencyConversion currencyConversion = new CurrencyConversion();
        double actualValue = currencyConversion.convert(100D,"usd","EUR");
        double expectedValue = 85D;

        Assertions.assertEquals(expectedValue,actualValue);

    }

    @Test
    void should_convertUSDToGBP_when_validAmountIsSent(){

        CurrencyConversion currencyConversion = new CurrencyConversion();
        double actualValue = currencyConversion.convert(100D,"USD","GBP");
        double expectedValue = 78D;

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void should_convertUSDToUSD_when_validAmountIsSent(){

        CurrencyConversion currencyConversion = new CurrencyConversion();
        double actualValue = currencyConversion.convert(100D,"USD","USD");
        double expectedValue = 100D;

        Assertions.assertEquals(expectedValue,actualValue);

    }

    @Test
    void should_ThrowIllegalArgumentException_InvalidConversionSent(){

        CurrencyConversion currencyConversion = new CurrencyConversion();
        Assertions.assertThrows(IllegalArgumentException.class, () -> currencyConversion.convert(100D,"ARS","YEN"));
    }

}
