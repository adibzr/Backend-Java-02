package com.soyhenry.ej12.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConversionRequest {

    private float amount;
    private String sourceCurrency;


}
