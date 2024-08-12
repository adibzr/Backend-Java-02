package service;

import dao.TarjetaCreditoDao;
import model.TarjetaCredito;

import java.util.List;

public class TarjetaCreditoService {

    TarjetaCreditoDao tarjetaCreditoDao = new TarjetaCreditoDao();

    public TarjetaCredito getTarjetaCreditoById(Long id){
        return tarjetaCreditoDao.getById(id);
    }

    public List<TarjetaCredito> getAllTarjetaCredito(){
        return tarjetaCreditoDao.getAll();
    }

    public void addTarjetaCredito(TarjetaCredito tarjetaCredito) {
        if(tarjetaCreditoDao.add(tarjetaCredito)){
            System.out.println("Tarjeta creada correctamente");
        }
        else {
            System.out.println("No se pudo generar la tarjeta");
        }

    }
}
