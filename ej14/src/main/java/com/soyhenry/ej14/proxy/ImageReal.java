package com.soyhenry.ej14.proxy;

public class ImageReal implements Image{

    private String fileName;

    public ImageReal(String fileName){
        this.fileName = fileName;
        loadImage(fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Cargando imagen: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Mostrando imagen: " + fileName);
    }
}
