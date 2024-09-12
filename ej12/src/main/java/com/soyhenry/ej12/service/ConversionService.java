package com.soyhenry.ej12.service;

import com.soyhenry.ej12.model.ConversionRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConversionService {

    private final Map<String,Double> exchangeRate = new HashMap<>();
/*
    public ConversionService() {
        exchangeRate.put("EUR",0.85);
        exchangeRate.put("USD",0.78);
    }

    public double convert(float amount, String currency) {

        if(exchangeRate.containsKey(currency)){
            return amount * exchangeRate.get(currency);
        }
        throw new IllegalArgumentException("Conversion rate not found for" + currency);

    }*/

    public double convert(String fromCurrency, String toCurrency, double amount) {
     //   RestTemplate restTemplate = new RestTemplate();
        String url = "pp";


        return 0.0;
    }

}
