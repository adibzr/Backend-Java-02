package com.soyhenry.ej14.adapter;

import com.soyhenry.ej14.adapter.adapter.PaymentProcessorAdapter;

public class BankPayment {

    private PaymentProcessorAdapter paymentProcessorAdapter;

    public void setPaymentProcessorAdapter(PaymentProcessorAdapter paymentProcessorAdapter){
        this.paymentProcessorAdapter = paymentProcessorAdapter;
    }

    public void doPayment(double amount){
        if(paymentProcessorAdapter == null){
            System.out.println("No se seleccionó ningún medio de pago");
        } else {
            paymentProcessorAdapter.processPayment(amount);
        }
    }
}
