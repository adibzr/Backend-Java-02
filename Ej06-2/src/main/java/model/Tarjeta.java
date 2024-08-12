package model;

public abstract class Tarjeta {
    private Long id;
    private String numero;
    private String Titular;

    public Tarjeta() {

    }

    public Tarjeta(Long id, String numero, String titular) {
        this.id = id;
        this.numero = numero;
        Titular = titular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", numero='" + numero + '\'' +
                ", Titular='" + Titular + '\'';
    }
}
