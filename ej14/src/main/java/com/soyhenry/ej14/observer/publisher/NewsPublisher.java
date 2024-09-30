package com.soyhenry.ej14.observer.publisher;

import com.soyhenry.ej14.observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detetach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(latestNews);
        }

    }

    public void publishNews(String news){
        this.latestNews = news;
        notifyObservers();
    }
}
