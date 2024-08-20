package model;

import java.time.LocalDate;

public class Person {
    private Long id;
    private String nombreApellido;
    private LocalDate fechaDeNacimiento;
    private String paisDeNacimiento;

    public Person() {
    }

    public Person(Long id, String nombreApellido, LocalDate fechaDeNacimiento, String paisDeNacimiento) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.paisDeNacimiento = paisDeNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPaisDeNacimiento() {
        return paisDeNacimiento;
    }

    public void setPaisDeNacimiento(String paisDeNacimiento) {
        this.paisDeNacimiento = paisDeNacimiento;
    }
}
