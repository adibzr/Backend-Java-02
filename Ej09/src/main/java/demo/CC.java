package demo;

import java.util.HashMap;
import java.util.Map;

/*
 * Test-Driven Development By Example -  Kent Beck
Made a list of the tests we knew we needed.
Generate test ignoring the details of JUnit for the moment.
Made the test compile with stubs.
Made the test run by committing horrible sins.
Gradually generalized the working code, replacing constants with variables, etc.
*/


public class CC {

    //3
    private final Map<String, Double> exchangeRates = new HashMap<>();

    //3
    public CC() {
        exchangeRates.put("USD-EUR",0.85);
        exchangeRates.put("USD-GBP",0.78);
    }

    public double convert(double amount, String convertFrom, String convertTO) {
        // 1
//         return 85D;

        // 2
//        if ("USD".equals(convertFrom) && "EUR".equals(convertTO)){
//            return amount * 0.85D;
//        }
//        return 0;

        //3
        String key = convertFrom.toUpperCase() + "-" + convertTO.toUpperCase(); //5
        if (convertFrom.equals(convertTO)) return amount; //4
        if (exchangeRates.containsKey(key)){
            return amount * exchangeRates.get(key);
        }
        throw new IllegalArgumentException("Conversion rate not found for " + convertFrom + " to " + convertTO);

        // 4 refactor argumentos typo y nombre, misma moneda
        // 5 uppercase

        // 6
//        String key = convertFrom.toUpperCase() + "-" + convertTO.toUpperCase();
//        if (exchangeRates.containsKey(key)){
//            return amount * exchangeRates.get(key);
//        } else {
//            key = convertTO.toUpperCase() + "-" + convertFrom.toUpperCase();
//            if (exchangeRates.containsKey(key)) {
//                invertir la conversión, evaluar si es mayor o menor
//                return amount * (1 / exchangeRates.get(key));
//            }
//            throw new IllegalArgumentException("Conversion rate not found for " + convertFrom + " to " + convertTO);
//        }

    }

}
