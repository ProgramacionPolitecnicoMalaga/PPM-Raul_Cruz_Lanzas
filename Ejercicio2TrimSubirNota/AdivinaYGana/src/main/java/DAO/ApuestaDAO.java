package DAO;

import AdivinaYGana.Modelo.Apuesta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApuestaDAO {
    private DBConn dbConn;

    public ApuestaDAO() throws SQLException {
        this.dbConn = new DBConn("192.168.2.216", "3306", "apuestas", "raul", "1234");
    }

    public boolean create(Apuesta apuesta) throws SQLException{
        //Insertas
        dbConn.queryUpdate("INSERT INTO apuestas(usuario_id,sorteo,numero) VALUES('" + apuesta.getId_usuario() + "'," + apuesta.getSorteo() + "'," + apuesta.getNumero() + ")");

        //Recuperas con todos los datos, tambien el id
        ResultSet result = dbConn.query("SELECT * FROM apuestas WHERE id_usuario = '" + apuesta.getId_usuario() + "' AND sorteo =" + apuesta.getSorteo() + "' AND numero =" + apuesta.getNumero());
        if (result.next()) {
            int id = result.getInt("id");
            apuesta.setId(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Apuesta> readAll() throws SQLException{
        ArrayList<Apuesta> listaApuestas = new ArrayList<>();
        ResultSet resultado = dbConn.query("SELECT * FROM apuestas");
        while (resultado.next()) {
            int id = resultado.getInt("id");
            int id_usuario = resultado.getInt("id_usuario");
            int sorteo = resultado.getInt("sorteo");
            int numero = resultado.getInt("numero");

            Apuesta apuesta = new Apuesta(id_usuario, sorteo, numero);
            listaApuestas.add(apuesta);
        }
        return listaApuestas;
    }

    public boolean update(Apuesta apuesta)throws SQLException{
        int filasAfectadas = dbConn.queryUpdate("UPDATE apuestas SET id_usuario = '" + apuesta.getId_usuario() + "'," + "sorteo=" + apuesta.getSorteo() + "'," + apuesta.getNumero() + " WHERE id = " + apuesta.getId());
        return filasAfectadas == 1;
    }

    public boolean delete(Apuesta apuesta) throws SQLException{
        String consulta = "DELETE FROM apuestas WHERE id= " + apuesta.getId();
        int filaAfectadas = dbConn.queryUpdate(consulta);
        return filaAfectadas == 1;
    }

    public void deleteAll() throws SQLException{
        int filaAfectadas = dbConn.queryUpdate("DELETE FROM apuestas");
    }
}
