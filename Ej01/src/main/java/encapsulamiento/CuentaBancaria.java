package encapsulamiento;

public class CuentaBancaria {

    private long id;
    public Float saldo;
    private String numeroDeCuenta;
    private String cbu;
    private Boolean activa;

    public Float devolverSaldo(){
        return saldo;
    }

    public void cargarSaldo(Float saldo){
        this.saldo = saldo;
    }


}
