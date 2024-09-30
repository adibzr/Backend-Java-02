package com.soyhenry.ej14.adapter.adapter;

/**
 Adapter Pattern
 Propósito: El patrón Adapter permite que clases con interfaces incompatibles puedan trabajar juntas.
 Convierte la interfaz de una clase en otra interfaz que el cliente espera.

 Ventajas:
 Permite la reutilización de clases existentes que no coinciden con la interfaz deseada.
 Aísla el código del cliente de los detalles de implementación.

 Desventajas:
 Aumenta la complejidad del código al añadir capas adicionales.
 */
public interface PaymentProcessorAdapter {
    void processPayment(double amount);
}
