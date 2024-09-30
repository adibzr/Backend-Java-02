package com.soyhenry.ej14.strategy;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pago de $" + amount + " realizado con Paypal");
    }
}
