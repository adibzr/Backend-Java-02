package com.soyhenry.ej14.adapter.external;

public class MastercarService {
    public void makePayment(double amount, String currency){
        System.out.println("Procesando pago de " + currency + " " + amount + " con Mastercard");
    }
}
