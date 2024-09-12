package com.soyhenry.ej12.controller;

import com.soyhenry.ej12.model.ConversionRequest;
import com.soyhenry.ej12.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConversionController {

    @Autowired
    ConversionService conversionService;

/*
    @PostMapping("/convert")
    public String convert(@RequestBody ConversionRequest request, Model model) {
        double result = conversionService.convert(request.getAmount(), request.getSourceCurrency());
        model.addAttribute("conversionResult", result);
        return "conversion";
    }

    @GetMapping("/convert")
    public String showForm(Model model) {
        model.addAttribute("conversionRequest", new ConversionRequest());
        return "conversion";

    }
*/
@GetMapping("/")
public String index() {
    return "index";
}

    @PostMapping("/convert")
    public String convert(@RequestParam String fromCurrency,
                          @RequestParam String toCurrency,
                          @RequestParam double amount,
                          Model model) {

        double convertedAmount = conversionService.convert(fromCurrency, toCurrency, amount);
        model.addAttribute("fromCurrency", fromCurrency);
        model.addAttribute("toCurrency", toCurrency);
        model.addAttribute("amount", amount);
        model.addAttribute("convertedAmount", convertedAmount);
        return "result";
    }

}
