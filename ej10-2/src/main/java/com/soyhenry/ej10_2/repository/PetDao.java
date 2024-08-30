package com.soyhenry.ej10_2.repository;


import com.soyhenry.ej10_2.conf.MySQLConnection;
import com.soyhenry.ej10_2.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PetDao implements Dao<Pet, Long>, MySQLConnection {

    private static final Logger log = LoggerFactory.getLogger(PetDao.class);
    private PreparedStatement psGetByID = null;
    private PreparedStatement psAdd = null;
    private PreparedStatement psGetAll = null;
    private PreparedStatement psDel = null;
    private PreparedStatement psUpd = null;

    @Override
    public Pet getById(Long id) {
        Pet pet = null;

        try {
            psGetByID = conectarDB().prepareStatement("SELECT id, nombre, especie "
                    + "FROM Animals "
                    + "WHERE id = ?;");
            psGetByID.setLong(1, id);
            ResultSet resultado = psGetByID.executeQuery();
            if(resultado.next()) {
                pet = new Pet();
                pet.setNombre(resultado.getString("nombre"));
                pet.setId(resultado.getLong("id"));
                pet.setEspecie(resultado.getString("especie"));
                System.out.println("mascota encontrada:" + pet.toString());
                log.info("mascota encontrada:" + pet);
                log.warn("mascota encontrada:" + pet);
                log.error("mascota encontrada:" + pet);
            }
            psGetByID.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pet;
    }

    @Override
    public List<Pet> getAll() {
        List<Pet> petsList = new ArrayList<>();

        try {
            psGetAll = conectarDB().prepareStatement("SELECT id, nombre, especie "
                    + "FROM Animals");
            ResultSet resultado = psGetAll.executeQuery();
            while(resultado.next()) {
                Pet petAux = new Pet();
                petAux.setNombre(resultado.getString("nombre"));
                petAux.setEspecie(resultado.getString("especie"));
                petAux.setId(resultado.getLong("id"));
                petsList.add(petAux);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return petsList;
    }

    @Override
    public Boolean add(Pet pet) {
        Boolean resultado = false;
        try {
            psAdd = conectarDB().prepareStatement("INSERT INTO Animals (nombre, especie) "
                    + " VALUES (?,?);");
            psAdd.setString(1, pet.getNombre());
            psAdd.setString(2, pet.getEspecie());
            if(psAdd.executeUpdate()==1) {
                resultado = true;
                System.out.println("mascota generada!:"+ pet.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Boolean del(Pet pet) {
        Boolean resultado = false;
        try {
            if(psDel == null) {
                psDel = conectarDB().prepareStatement("DELETE FROM Animals WHERE id = ? ");
            }
            psDel.setLong(1, pet.getId());
            if(psDel.executeUpdate()==1) {
                resultado = true;
                System.out.println("mascota eliminada:" + pet.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Boolean upd(Pet pet) {
        Boolean resultado = false;
        try {
            if(psUpd == null) {
                psUpd = conectarDB().prepareStatement("UPDATE Animals SET nombre=?, especie=? "
                        + " WHERE id = ?");
            }
            psUpd.setString(1, pet.getNombre());
            psUpd.setString(2, pet.getEspecie());
            psUpd.setLong(3, pet.getId());
            if (psUpd.executeUpdate() == 1) {
                resultado = true;
                System.out.println("Se actualizó la mascota: "+ pet.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}
