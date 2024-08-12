package dao;

import conf.H2Connection;
import model.TarjetaCredito;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarjetaCreditoDao implements Dao<TarjetaCredito,Long>, H2Connection {

    private PreparedStatement psGetByID = null;
    private PreparedStatement psAdd = null;
    private PreparedStatement psGetAll = null;
    private PreparedStatement psDel = null;
    private PreparedStatement psUpd = null;

    @Override
    public TarjetaCredito getById(Long id) {
        return null;
    }

    @Override
    public List<TarjetaCredito> getAll() {
        List<TarjetaCredito> tarjetas = new ArrayList<>();

        try {
            psGetAll = conectarDB().prepareStatement("SELECT id, numero, titular FROM tarjetacredito");
            ResultSet resultado = psGetAll.executeQuery();
            while(resultado.next()) {
                TarjetaCredito tarjetaAux = new TarjetaCredito();
                tarjetaAux.setNumero(resultado.getString("numero"));
                tarjetaAux.setTitular(resultado.getString("titular"));
                tarjetaAux.setId(resultado.getLong("id"));
                tarjetas.add(tarjetaAux);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarjetas;
    }

    @Override
    public Boolean add(TarjetaCredito tarjetaCredito) {
        return null;
    }

    @Override
    public Boolean del(TarjetaCredito tarjetaCredito) {
        return null;
    }

    @Override
    public Boolean upd(TarjetaCredito tarjetaCredito) {
        return null;
    }
}
