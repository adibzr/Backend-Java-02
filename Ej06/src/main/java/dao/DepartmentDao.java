package dao;

import conf.H2Connection;
import model.Department;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartmentDao implements Dao<Department, Long>, H2Connection {

    private PreparedStatement psGetByID = null;
    private PreparedStatement psAdd = null;
    private PreparedStatement psGetAll = null;
    private PreparedStatement psDel = null;
    private PreparedStatement psUpd = null;

    @Override
    public Department getById(Long id) {
        Department department = null;

        try {
            psGetByID = conectarDB().prepareStatement("SELECT id, name, description "
                    + "FROM department "
                    + "WHERE id = ?;");
            psGetByID.setLong(1, id);
            ResultSet resultado = psGetByID.executeQuery();
            if(resultado.next()) {
                department = new Department();
                department.setName(resultado.getString("name"));
                department.setId(resultado.getLong("id"));
                department.setDescription(resultado.getString("description"));
            }
            psGetByID.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }

    @Override
    public List<Department> getAll() {
        List<Department> departmentsList = new ArrayList<>();

        try {
            psGetAll = conectarDB().prepareStatement("SELECT id, name, description "
                    + "FROM departments");
            ResultSet resultado = psGetAll.executeQuery();
            while(resultado.next()) {
                Department departmentAux = new Department();
                departmentAux.setName(resultado.getString("name"));
                departmentAux.setDescription(resultado.getString("description"));
                departmentAux.setId(resultado.getLong("id"));
                departmentsList.add(departmentAux);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departmentsList;
    }

    @Override
    public Boolean add(Department department) {
        Boolean resultado = false;
        try {
            psAdd = conectarDB().prepareStatement("INSERT INTO departments (nombre, description) "
                    + " VALUES (?,?);");
            psAdd.setString(1, department.getName());
            psAdd.setString(2, department.getDescription());
            if(psAdd.executeUpdate()==1) {
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Boolean del(Department department) {
        Boolean resultado = false;
        try {
            if(psDel == null) {
                psDel = conectarDB().prepareStatement("DELETE FROM departments WHERE id = ? ");
            }
            psDel.setLong(1, department.getId());
            if(psDel.executeUpdate()==1) {
                resultado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Boolean upd(Department department) {
        Boolean resultado = false;
        try {
            if(psUpd == null) {
                psUpd = conectarDB().prepareStatement("UPDATE departments SET name=?, description=? "
                        + " WHERE id = ?");
            }
            psUpd.setString(1, department.getName());
            psUpd.setString(2, department.getDescription());
            psUpd.setLong(3, department.getId());
            if (psUpd.executeUpdate() == 1) {
                resultado = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}
