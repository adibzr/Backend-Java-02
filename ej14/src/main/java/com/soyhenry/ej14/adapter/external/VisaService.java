package com.soyhenry.ej14.adapter.external;

public class VisaService {
    public void executePayment(double amount, int type){
        System.out.println("Procesando pago de $" + amount + " tipo:" + type + " con Visa");
    }
}
