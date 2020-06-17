package DAO;

import AdivinaYGana.Modelo.Sorteo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SorteoDAO {
    private DBConn dbConn;

    public SorteoDAO() throws SQLException {
        this.dbConn = new DBConn("192.168.2.216", "3306", "usuarios", "raul", "1234");
    }

    public boolean create(Sorteo sorteo) throws SQLException{
        //Insertas
        dbConn.queryUpdate("INSERT INTO sorteos(ganador_id,resultado,numero) VALUES('" + sorteo.getApuesta_ganada() + "'," + sorteo.getNum_sorteo() + "'," + sorteo.getResultado() + ")");

        //Recuperas con todos los datos, tambien el id
        ResultSet result = dbConn.query("SELECT * FROM sorteos WHERE ganador_id = '" + sorteo.getApuesta_ganada() + "' AND resultado =" + sorteo.getResultado() + "' AND numero =" +sorteo.getNum_sorteo());
        if (result.next()) {
            int num_id = result.getInt("id");
            sorteo.setNum_id(num_id);
            return true;
        } else {
            return false;
        }
    }

    public List<Sorteo> readAll() throws SQLException{
        ArrayList<Sorteo> listaSorteos = new ArrayList<>();
        ResultSet resultado = dbConn.query("SELECT * FROM sorteos");
        while (resultado.next()) {
            int id = resultado.getInt("id");
            int apuesta_ganada = resultado.getInt("ganador_id");
            double resultado1 = resultado.getDouble("resultado");
            int numero_sorteo = resultado.getInt("numero");

            Sorteo sorteo = new Sorteo(apuesta_ganada, resultado1, numero_sorteo);
            listaSorteos.add(sorteo);
        }
        return listaSorteos;
    }

    public boolean update(Sorteo sorteo)throws SQLException{
        int filasAfectadas = dbConn.queryUpdate("UPDATE sorteos SET ganador_id = '" + sorteo.getApuesta_ganada() + "'," + "resultado=" + sorteo.getResultado() + "'," + sorteo.getNum_sorteo()+ " WHERE id = " + sorteo.getNum_id());
        return filasAfectadas == 1;
    }

    public boolean delete(Sorteo sorteo) throws SQLException{
        String consulta = "DELETE FROM sorteos WHERE id= " + sorteo.getNum_id();
        int filaAfectadas = dbConn.queryUpdate(consulta);
        return filaAfectadas == 1;
    }

    public void deleteAll() throws SQLException{
        int filaAfectadas = dbConn.queryUpdate("DELETE FROM sorteos");
    }
}
