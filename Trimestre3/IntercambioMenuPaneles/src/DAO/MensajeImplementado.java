package DAO;

import EXCEPTIONS.ConexionException;
import MODELO.Mensaje;

import java.sql.*;
import java.util.ArrayList;

public class MensajeImplementado implements MensajeDAO {
    @Override
    public boolean insertar(Mensaje mensaje) throws SQLException {
        boolean insertado = false;
        String query = "INSERT INTO Mensaje (titulo, texto, emisor, receptor, fecha, idDestinatario)" + "VALUES (?,?,?,?,?)";

        try{
            Connection connection = DbConn.conexionBD();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, mensaje.getTitulo());
            preparedStatement.setString(2, mensaje.getTexto());
            preparedStatement.setString(3, mensaje.getEmisor());
            preparedStatement.setString(4, mensaje.getReceptor());
            preparedStatement.setString(5, mensaje.getFecha());
            preparedStatement.setInt(mensaje.getIdDestinatario(), 6);
            insertado = true;
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return insertado;
    }

    @Override
    public ArrayList<Mensaje> mostrar() {
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        String querry = "SELECT * FROM Mensaje";

        try{
            Connection connection = DbConn.conexionBD();
            Statement statement = (PreparedStatement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querry);
            while (resultSet.next()){
                Mensaje mensaje = new Mensaje(titulo, texto, emisor, receptor, idRemitente);
                mensaje.setId(resultSet.getInt("id"));
                mensaje.setTitulo(resultSet.getString("titulo"));
                mensaje.setTexto(resultSet.getString("texto"));
                mensaje.setEmisor(resultSet.getString("emisor"));
                mensaje.setReceptor(resultSet.getString("receptor"));
                mensaje.setFecha(resultSet.getString("fecha"));
                mensaje.setIdDestinatario(resultSet.getInt("idDestinatario"));
                mensajes.add(mensaje);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mensajes;
    }

    @Override
    public Mensaje buscarMensaje(String emisor) throws SQLException, ConexionException {
        String querry = "SELECT * FROM Mensaje WHERE emisor LIKE '%"+ emisor +"%'";
        Mensaje mensaje = new Mensaje(titulo, texto, emisor, receptor, idRemitente);

        Connection connection = DbConn.conexionBD();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry);

        while (resultSet.next()){
            mensaje.setTitulo(resultSet.getString("titulo"));
            mensaje.setTexto(resultSet.getString("texto"));
        }
        statement.close();
        resultSet.close();
        connection.close();
        return mensaje;
    }
}
