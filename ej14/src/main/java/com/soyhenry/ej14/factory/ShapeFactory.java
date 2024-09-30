package com.soyhenry.ej14.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *Factory Pattern
 * Propósito: El patrón Factory proporciona una interfaz para crear objetos, pero permite que las subclases decidan qué clase de
 * objeto instanciar. Centraliza la creación de objetos.
 *
 * Ventajas:
 * *    Desacopla la creación de objetos de su uso.
 *      Mejora la flexibilidad y facilita la adición de nuevas clases sin modificar el código existente.
 *
 * Desventajas:
 * *    Puede resultar en una cantidad considerable de subclases.
 *
 * Supplier es una interfaz funcional que permite instanciar una forma a demanda cuando se llama su método get()
 */
public class ShapeFactory {

    //Refactor 1 (con un map)
    private final Map<String, Supplier<Shape>> shapeMap = new HashMap<>();

    //Refactor 1
    public ShapeFactory(){
        shapeMap.put("CIRCLE", Circle::new);
        shapeMap.put("SQUARE", Square::new);
        shapeMap.put("TRIANGLE", Triangule::new);

    }

    //TODO: Refactor 2 - con enum para las shapes

    public Shape getShape(String shapeType){

        if (shapeType == null){
            return null;
        }

        // Implementación básica
        /*
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if ( shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangule();
        }
        return null;
        */

        //Refactor 1
        Supplier<Shape> shapeSupplier = shapeMap.get(shapeType.toUpperCase());
        return (shapeSupplier != null) ? shapeSupplier.get() : null;

    }
}
