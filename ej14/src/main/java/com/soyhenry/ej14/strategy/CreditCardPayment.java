package com.soyhenry.ej14.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pago de $"+ amount + " con tarjeta de crédito");
    }
}
