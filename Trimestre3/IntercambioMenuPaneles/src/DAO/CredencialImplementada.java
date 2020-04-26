package DAO;

import EXCEPTIONS.ConexionException;
import EXCEPTIONS.QueryException;
import MODELO.Credencial;

import java.sql.*;
import java.util.ArrayList;

public class CredencialImplementada implements CredencialDAO {

    @Override
    public ArrayList<Credencial> mostrar() {
        ArrayList<Credencial> credencials = new ArrayList<>();
        String querry = "SELECT * FROM Credencial";

        try{
            Connection connection = DbConn.conexionBD();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querry);

            while (resultSet.next()){
                Credencial credencial = new Credencial();
                credencial.setId(resultSet.getInt("id"));
                credencial.setNombre(resultSet.getString("nombre"));
                credencial.getClave(resultSet.getString("clave"));
                credencial.getAlgoritmo(resultSet.getString("algoritmo"));
                credencials.add(credencial);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return credencials;
    }

    @Override
    public boolean insertar(Credencial credencial) {
        boolean registrado = false;
        String query = "INSERT INTO Credencial (nombre, clave, algoritmo)" + "VALUES (?,?,?)";

        try{
            Connection connection = DbConn.conexionBD();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, credencial.getNombre());
            preparedStatement.setString(2, credencial.getClave("clave"));
            preparedStatement.setString(3, credencial.getAlgoritmo("algoritmo"));
            registrado = true;
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Credencial buscarUsuario(String nombre) throws ConexionException, SQLException, QueryException {
        Credencial credencial = null;
        String querry = "SELECT * FROM Credencial WHERE nombre LIKE '%"+ nombre +"%'";

        Connection connection = DbConn.conexionBD();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry);

        while (resultSet.next()) {
            credencial = new Credencial();
            credencial.setId(resultSet.getInt("id"));
            credencial.setNombre(resultSet.getString("nombre"));
            credencial.setClave(resultSet.getString("clave"));
            credencial.setAlgoritmo(resultSet.getString("algoritmo"));
        }
        statement.close();
        resultSet.close();
        connection.close();

        if(credencial != null){
            return credencial;
        }else {
            throw new QueryException("El usuario no es correcto");
        }
    }

    @Override
    public Integer buscarId(String nombre) {
        int id = 0;
        String querry = "SELECT id FROM Credencial WHERE nombre LIKE '%"+ nombre +"%'";

        try{
            Connection connection = DbConn.conexionBD();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querry);

            while (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public ArrayList<Credencial> mostrarNombres() {
        ArrayList<Credencial> credencials = new ArrayList<>();
        String querry = "SELECT nombre FROM Credencial";

        try{
            Connection connection = DbConn.conexionBD();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querry);

            while (resultSet.next()) {
                Credencial credencial = new Credencial();
                credencial.setNombre(resultSet.getString("nombre"));
                credencials.add(credencial);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return credencials;
    }
}
