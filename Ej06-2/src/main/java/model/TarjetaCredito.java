package model;

public class TarjetaCredito extends Tarjeta{

    public TarjetaCredito() {
        super();
    }

    public TarjetaCredito(Long id, String numero, String titular) {
        super(id, numero, titular);
    }

    @Override
    public String toString() {
        return "TarjetaCredito{ " + super.toString() + "}";
    }
}
