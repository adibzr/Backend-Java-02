package com.soyhenry.ej14.observer.subscriber;

public class EmailSuscriber implements Observer{
    private String name;

    public EmailSuscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recibió una notericación por email: " + message);
    }
}
