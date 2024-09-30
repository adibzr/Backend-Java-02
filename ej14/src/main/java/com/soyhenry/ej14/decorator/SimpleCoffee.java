package com.soyhenry.ej14.decorator;

// Clase ConcreteComponent (Implementación básica)
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
