package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CCTest {


    // 1 USD = 0.85 EUR
    // 1 EUR = 162.76 YEN
    // 1 USD = 0,78 GBP
    // 1 USD = 937,96 ARS
    // 1 USD = 18,68 MXN

    @Test
    void should_convertUSDToEUR_when_validAmountsAreSent(){

        CC currencyConv = new CC();
        double result = currencyConv.convert(100D,"USD","EUR");

        Assertions.assertEquals(85, result);

    }

    @Test
    void should_convertUSDToGBP_when_validAmountsAreSent(){
        CC currencyC = new CC();
        double result = currencyC.convert(100,"USD","GBP");

        Assertions.assertEquals(78,result);
    }

    //3
    @Test
    void should_ThrowIllegalArgumentException_when_InvalidCurrencyIsSent(){
        CC cc = new CC();

        Assertions.assertThrows(IllegalArgumentException.class , () -> cc.convert(100,"ARS","YEN"));
    }

    //4
    @Test
    void should_convertUSDToUSD_when_validAmountsAreSent(){
        CC currencyC = new CC();
        double result = currencyC.convert(100,"USD","USD");

        Assertions.assertEquals(100,result);
    }

    //5
    @Test
    void should_convertUSDToGBP_when_validAmountsAreSentAndIsLowerCase(){
        CC currencyC = new CC();
        double result = currencyC.convert(100,"usd","gbp");

        Assertions.assertEquals(78,result);
    }

}
