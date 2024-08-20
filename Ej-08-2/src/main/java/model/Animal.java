package model;

import java.time.LocalDate;

public class Animal {
    private Long id;
    private String especie;
    private String raza;
    private LocalDate fechaDeNacimiento;
    private Boolean estaVivo;

    public Animal() {
    }

    public Animal(Long id, String especie, String raza, LocalDate fechaDeNacimiento, Boolean estaVivo) {
        this.id = id;
        this.especie = especie;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estaVivo = estaVivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
