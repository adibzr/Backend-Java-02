package com.soyhenry.ej14.decorator;

/**
Decorator Pattern se utiliza para agregar funcionalidad a un objeto de manera dinámica,
sin modificar la estructura del objeto original. Se pueden agregar responsabilidades adicionales a los objetos de forma flexible y eficiente.

Ventajas:
    Extensibilidad: Puedes agregar funcionalidades de manera dinámica y en tiempo de ejecución.
    Composición: Favorece la composición sobre la herencia, ya que permite decorar objetos sin crear nuevas subclases.

Desventajas:
    Complejidad: Puede aumentar la complejidad del código si se abusa de los decoradores.
    Múltiples decoradores: Muchos decoradores pueden ser difíciles de seguir o comprender.
 */
// Clase Decorator abstracta
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
