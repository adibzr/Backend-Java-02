package com.soyhenry.ej14.observer.subscriber;

public class SMSSubscriber implements Observer{
    private String name;

    public SMSSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recibió una notificación por SMS: " + message);
    }
}
