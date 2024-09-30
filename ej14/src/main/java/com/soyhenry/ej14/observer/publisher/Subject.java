package com.soyhenry.ej14.observer.publisher;

import com.soyhenry.ej14.observer.subscriber.Observer;

public interface Subject {
    void attach(Observer observer);
    void detetach(Observer observer);
    void notifyObservers();
}
