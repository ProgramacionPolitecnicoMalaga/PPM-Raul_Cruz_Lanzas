package DAO;

import Modelo.Credencial;

import java.sql.*;
import java.util.ArrayList;

public class Consulta {
    ArrayList<Credencial> credencials = new ArrayList<>();
    Credencial c = new Credencial();
    ConexionBSD conexionBSD;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public Consulta() {
        conexionBSD = new ConexionBSD();
    }

    public ArrayList<Credencial> mostrarCredenciales() throws SQLException {
        connection = conexionBSD.conectar();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Usuario");
        while (resultSet.next()) {
            c.setNombre(resultSet.getString("nombre"));
            c.setHash(resultSet.getString("clave"));
            c.setAlgoritmo(resultSet.getString("algoritmo"));
            credencials.add(c);
        }
        statement.close();
        resultSet.close();
        connection.close();
        return credencials;
    }

    public Credencial buscarCredencial(String nombre) throws SQLException {
        Credencial credencial = new Credencial();
        connection = conexionBSD.conectar();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Usuario WHERE nombre LIKE '%"+nombre+"%'");
        while (resultSet.next()) {
            credencial.setNombre(resultSet.getString("nombre"));
            credencial.setHash(resultSet.getString("clave"));
            credencial.setAlgoritmo(resultSet.getString("algoritmo"));
        }
        statement.close();
        resultSet.close();
        connection.close();
        return credencial;
    }

    public boolean insertar(Credencial c) {
        boolean registrado = false;

        try {
            Connection con = conexionBSD.conectar();
            String query = "INSERT INTO Usuario (nombre,clave, algoritmo)" + " VALUES (?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, c.getNombre());
            stm.setString (2, c.getHash());
            stm.setString (3, c.getAlgoritmo());
            registrado = true;
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }
}
