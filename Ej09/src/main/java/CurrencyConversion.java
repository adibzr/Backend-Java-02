import java.util.HashMap;
import java.util.Map;

public class CurrencyConversion {

    private final Map<String,Double> exchangeRate = new HashMap<>();

    public CurrencyConversion() {
        exchangeRate.put("USD-EUR",0.85);
        exchangeRate.put("USD-GBP",0.78);
    }

    public double convert(double amount, String convertFrom, String convertTo) {

        String key = convertFrom.toUpperCase() + "-" + convertTo.toUpperCase();

        if (convertFrom.equals(convertTo)) return amount;
        if(exchangeRate.containsKey(key)){
            return amount * exchangeRate.get(key);
        }
        throw new IllegalArgumentException("Conversion rate not found" + convertFrom + " to " + convertTo);
    }
}
