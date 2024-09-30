package com.soyhenry.ej14.strategy;

/**
Patrón Strategy
Descripción:
El patrón Strategy permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables.
El patrón Strategy permite cambiar el comportamiento de un algoritmo en tiempo de ejecución sin modificar el contexto que lo utiliza.

Ventajas:
    Abre el comportamiento a la extensión sin modificar el código existente.
    Facilita el mantenimiento y evolución del software.
    Evita grandes bloques de condiciones.
Desventajas:
    El cliente debe conocer las diferentes estrategias y elegir cuál usar.
    Incrementa el número de clases en el sistema.
 */

public interface PaymentStrategy {

    void pay(double amount);
}
