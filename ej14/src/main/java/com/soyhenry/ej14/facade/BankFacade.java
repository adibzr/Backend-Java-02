package com.soyhenry.ej14.facade;

/**
Patrón Facade
Descripción:
El patrón Facade proporciona una interfaz simplificada a un conjunto de subsistemas complejos.
En lugar de interactuar directamente con varias clases y métodos, el cliente utiliza una sola interfaz para acceder
a la funcionalidad de un sistema.

Ventajas:
    Reduce la complejidad de los subsistemas para los clientes.
    Facilita el uso de sistemas complejos al proporcionar una interfaz unificada.
    Ayuda a desacoplar el código.
Desventajas:
    Agrega una capa extra de abstracción, lo que puede esconder funcionalidades específicas que el cliente pueda necesitar.
    Si no se gestiona bien, puede llevar a un "Dios" de clase (demasiada responsabilidad en una clase única).
 */

public class BankFacade {
    private AccountService accountService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    //método del facade simplificado
    public void makePayment(String accountId, Double amount){
        accountService.getAccountDetails(accountId);
        paymentService.processPayment(accountId,amount);
        notificationService.sendNotification(accountId);
        System.out.println("Se procesó el pago con facade");
    }
}
