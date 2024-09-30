package com.soyhenry.ej14.adapter.adapter;

import com.soyhenry.ej14.adapter.external.VisaService;

public class VisaAdapter implements  PaymentProcessorAdapter{

    private VisaService visaService;
    private int type;

    public VisaAdapter(VisaService visaService, int type){
        this.visaService = visaService;
        this.type = type;
    }

    @Override
    public void processPayment(double amount) {
        visaService.executePayment(amount,type);
    }
}
