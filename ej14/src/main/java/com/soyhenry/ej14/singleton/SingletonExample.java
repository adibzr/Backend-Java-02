package com.soyhenry.ej14.singleton;

/**

El patrón Singleton garantiza que una clase solo tenga una única instancia, proporcionando un punto de acceso global a dicha instancia.
Es útil cuando necesitamos una única instancia para gestionar recursos compartidos, como conexiones a bases de datos o registros.

Ventajas:
    Control de la cantidad de instancias.
    Ahorro de memoria, al evitar crear múltiples instancias.
    Proporciona un acceso global a la instancia única.
Desventajas:
    Puede violar el principio de responsabilidad única, ya que la clase maneja tanto la lógica del negocio como la creación de su propia instancia.
    Dificultad para testear debido a su naturaleza estática.
 */

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample() {}

    public static SingletonExample getInstance(){
        if(singletonExample == null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void log (String mensaje){
        System.out.println("Mensaje Singleton:" + mensaje);
    }


}
