package com.soyhenry.ej14.facade;

public class PaymentService {

    public void processPayment(String accountID, Double amount){
        //realizar un pago
        System.out.println("Procesando pago de $"+ amount + " para la cuenta " + accountID);
    }

}
