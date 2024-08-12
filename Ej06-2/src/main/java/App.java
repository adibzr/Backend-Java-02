import model.TarjetaCredito;
import service.TarjetaCreditoService;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("HW -06 Tarjetas");
        TarjetaCreditoService tarjetaCreditoService = new TarjetaCreditoService();

        // getAll
        List<TarjetaCredito> tarjetas= tarjetaCreditoService.getAllTarjetaCredito();
        tarjetas.stream()
                .forEach(System.out::println);

        //add
        TarjetaCredito tarjetaCredito = new TarjetaCredito(null,"8854 8784 6652 5475", "Monica Gomez");
        tarjetaCreditoService.addTarjetaCredito(tarjetaCredito);

    }
}
