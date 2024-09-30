package com.soyhenry.ej14.observer.subscriber;

/**
El patrón Observer (Observador) establece una relación uno a muchos entre objetos, donde cuando el estado de un objeto cambia (el sujeto),
 todos los objetos dependientes (observadores) son notificados y actualizados automáticamente.
 Es útil cuando necesitas que múltiples objetos reaccionen a cambios en otro objeto sin acoplarlos fuertemente.

Ventajas:
    Desacoplamiento: Los observadores no necesitan conocer detalles sobre el sujeto, lo que reduce el acoplamiento entre ellos.
    Facilidad de actualización: Si el estado del sujeto cambia, todos los observadores son notificados automáticamente, manteniendo la consistencia.
    Escalabilidad: Puedes añadir o eliminar observadores fácilmente sin modificar el sujeto.

Desventajas:
    Notificación en cascada: Si tienes muchos observadores, puede haber una cascada de notificaciones, lo que podría afectar al rendimiento.
    Dependencia indirecta: Puede ser difícil de rastrear qué objetos están observando a cuáles, lo que puede complicar el código
 */
public interface Observer {

    void update(String message);
}
