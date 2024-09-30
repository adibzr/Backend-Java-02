package com.soyhenry.ej14.builder;

public class Car {
    private String brand;
    private String model;
    private String engine;
    private int year;
    private String color;

    public Car(String brand, String model, String engine, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
