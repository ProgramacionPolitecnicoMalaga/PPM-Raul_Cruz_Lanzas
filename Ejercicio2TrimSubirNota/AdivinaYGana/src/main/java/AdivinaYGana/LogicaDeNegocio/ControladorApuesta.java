package AdivinaYGana.LogicaDeNegocio;

import AdivinaYGana.Modelo.Apuesta;
import DAO.ApuestaDAO;

import java.sql.SQLException;
import java.util.List;

public class ControladorApuesta {
    public boolean crearApuesta(int usuario_id, int sorteo, int numero) throws SQLException {
        ApuestaDAO apuestaDAO = new ApuestaDAO();
        return apuestaDAO.create(new Apuesta(usuario_id, sorteo, numero));
    }

    public List<Apuesta> getApuestas() throws SQLException{
        ApuestaDAO apuestaDAO = new ApuestaDAO();
        return apuestaDAO.readAll();
    }
}
