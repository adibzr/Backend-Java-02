package com.soyhenry.ej14.adapter.adapter;

import com.soyhenry.ej14.adapter.external.MastercarService;

public class MastercardAdapter implements PaymentProcessorAdapter{

    private MastercarService mastercarService;
    private String currency;

    public MastercardAdapter(MastercarService mastercarService, String currency){
        this.mastercarService = mastercarService;
        this.currency = currency;
    }

    @Override
    public void processPayment(double amount) {
        mastercarService.makePayment(amount,currency);
    }
}
