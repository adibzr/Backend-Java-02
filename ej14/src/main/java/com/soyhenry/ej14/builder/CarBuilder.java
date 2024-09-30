package com.soyhenry.ej14.builder;

/**
 Builder Pattern
 Propósito: El patrón Builder separa la construcción de un objeto complejo de su representación,
 permitiendo crear objetos paso a paso con múltiples propiedades opcionales.

 Ventajas:
 Mejora la legibilidad cuando un objeto tiene muchas propiedades opcionales.
 Evita la creación de múltiples constructores.

 Desventajas:
 Aumenta la complejidad del código con la creación de una clase adicional (el Builder).
 */

public class CarBuilder {
    private String brand;
    private String model;
    private String engine;
    private int year;
    private String color;

    public CarBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model){
        this.model = model;
        return this;
    }

    public CarBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder setYear(int year){
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(brand,model,engine,year,color);
    }
}
