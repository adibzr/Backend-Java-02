package model;

public class TarjetaDebito extends Tarjeta{
    public TarjetaDebito(Long id, String numero, String titular) {
        super(id, numero, titular);
    }

    @Override
    public String toString() {
        return "TarjetaDebito{ " + super.toString() + "}";
    }
}
