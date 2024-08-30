package com.soyhenry.ej11.repository;



import com.soyhenry.ej11.conf.MySQLConnection;
import com.soyhenry.ej11.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDao implements Dao<Movie, Long>, MySQLConnection {

    private static final Logger log = LoggerFactory.getLogger(MovieDao.class);
    private PreparedStatement psGetByID = null;
    private PreparedStatement psAdd = null;
    private PreparedStatement psGetAll = null;
    private PreparedStatement psDel = null;
    private PreparedStatement psUpd = null;

    @Override
    public Movie getById(Long id) {
        Movie movie = null;

        try {
            psGetByID = conectarDB().prepareStatement("SELECT id, movieName, description, yearOfRelease "
                    + "FROM Movies "
                    + "WHERE id = ?;");
            psGetByID.setLong(1, id);
            ResultSet resultado = psGetByID.executeQuery();
            if(resultado.next()) {
                movie = new Movie();
                movie.setName(resultado.getString("movieName"));
                movie.setId(resultado.getLong("id"));
                movie.setDescription(resultado.getString("description"));
                movie.setYearOfRelease(resultado.getInt("yearOfRelease"));
                System.out.println("Película encontrada:" + movie);
                log.info("Película encontrada:" + movie);
                log.warn("Película encontrada:" + movie);
                log.error("Película encontrada:" + movie);
            }
            psGetByID.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }

    @Override
    public List<Movie> getAll() {
        List<Movie> petsList = new ArrayList<>();

        try {
            psGetAll = conectarDB().prepareStatement("SELECT id, movieName, description, yearOfRelease "
                    + "FROM Movies");
            ResultSet resultado = psGetAll.executeQuery();
            while(resultado.next()) {
                Movie movieAux = new Movie();
                movieAux.setName(resultado.getString("movieName"));
                movieAux.setId(resultado.getLong("id"));
                movieAux.setDescription(resultado.getString("description"));
                movieAux.setYearOfRelease(resultado.getInt("yearOfRelease"));
                petsList.add(movieAux);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return petsList;
    }

    @Override
    public Boolean add(Movie movie) {
        Boolean resultado = false;
        /*
        try {
            psAdd = conectarDB().prepareStatement("INSERT INTO Movies (nombre, especie) "
                    + " VALUES (?,?);");
            psAdd.setString(1, movie.getNombre());
            psAdd.setString(2, movie.getEspecie());
            if(psAdd.executeUpdate()==1) {
                resultado = true;
                System.out.println("Película generada!:"+ movie.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        return resultado;


    }

    @Override
    public Boolean del(Movie movie) {
        Boolean resultado = false;
        /*
        try {
            if(psDel == null) {
                psDel = conectarDB().prepareStatement("DELETE FROM Movies WHERE id = ? ");
            }
            psDel.setLong(1, movie.getId());
            if(psDel.executeUpdate()==1) {
                resultado = true;
                System.out.println("Película eliminada:" + movie.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

         */
        return resultado;
    }

    @Override
    public Boolean upd(Movie movie) {
        Boolean resultado = false;
        /*
        try {
            if(psUpd == null) {
                psUpd = conectarDB().prepareStatement("UPDATE Movies SET nombre=?, especie=? "
                        + " WHERE id = ?");
            }
            psUpd.setString(1, movie.getNombre());
            psUpd.setString(2, movie.getEspecie());
            psUpd.setLong(3, movie.getId());
            if (psUpd.executeUpdate() == 1) {
                resultado = true;
                System.out.println("Se actualizó la Película: "+ movie.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


         */
        return resultado;
    }
}
