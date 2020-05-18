package Recuperacion2Trimestre.DAO;

import Recuperacion2Trimestre.Rack.Rack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RackDAO {
    private DBConn dbConn;

    public RackDAO() throws SQLException {
        dbConn = new DBConn();
    }

    public boolean create(Rack rack) throws SQLException {
        dbConn.queryUpdate("INSERT INTO rack(nombre, edad) VALUES ('" + rack.getEtiqueta() + "','" + rack.getTipo() + "')");
        ResultSet resultSet = dbConn.query("SELECT id FROM rack WHERE etiqueta='" + rack.getEtiqueta());
        if (resultSet.next()) {
            rack.setId(resultSet.getInt("id"));
            return true;
        } else {
            return false;
        }
    }

    public List<Rack> readAll() throws SQLException {
        List<Rack> listaRacks = new ArrayList<>();
        ResultSet resultSet = dbConn.query("SELECT * FROM rack");
        while (resultSet.next()) {
            Rack rack = new Rack(resultSet.getString("etiqueta"), resultSet.getString("tipo"));
            rack.setId(resultSet.getInt("id"));
            listaRacks.add(rack);
        }
        return listaRacks;
    }

    public boolean update(Rack rack) throws SQLException {
        int filasSeleccionadas = dbConn.queryUpdate("UPDATE rack SET etiquete='" + rack.getEtiqueta() + "', tipo='" + rack.getTipo() + "', id='" + rack.getId() + "'");
        return (filasSeleccionadas == 1);
    }

    public boolean delete(Rack rack) throws SQLException {
        int filasSeleccionadas = dbConn.queryUpdate("DELETE FROM rack WHERE id='" + rack.getId() + '"');
        return (filasSeleccionadas == 1);
    }

    public void deleteAll() throws SQLException {
        int filasSeleccionadas = dbConn.queryUpdate("DELETE FROM usuarios");
    }

    public Rack readById(int id) throws SQLException {
        ResultSet resultSet = dbConn.query("SELECT * FROM usuarios WHERE id'" + id + "'");
        if (resultSet.next()) {
            Rack rack = new Rack(resultSet.getString("etiqueta"), resultSet.getString("tipo"));
            rack.setId(resultSet.getInt("id"));
            return rack;
        } else {
            return null;
        }
    }
}
