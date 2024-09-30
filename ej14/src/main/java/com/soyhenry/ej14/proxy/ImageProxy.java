package com.soyhenry.ej14.proxy;

/**
 Proxy Pattern
 Propósito: El patrón Proxy proporciona un sustituto o representante para controlar el acceso a otro objeto.
 Se puede usar para agregar control de acceso, cargar perezosamente o realizar tareas adicionales antes o después de acceder a un objeto.

 Ventajas:
 Control sobre el acceso a los objetos.
 Permite añadir funcionalidades como autenticación, logging o caching sin modificar la clase original.

 Desventajas:
 Puede incrementar la complejidad con capas adicionales de abstracción.
 */
public class ImageProxy implements Image{

    private ImageReal imageReal;
    private String fileName;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(imageReal == null){
            imageReal = new ImageReal(fileName);
        }
        imageReal.display();
    }
}
