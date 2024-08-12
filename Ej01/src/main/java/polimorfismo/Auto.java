package polimorfismo;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, Integer combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void desplazarse(Integer metros){
        System.out.println("El auto se desplaza " + metros + " metros");
    }
}
