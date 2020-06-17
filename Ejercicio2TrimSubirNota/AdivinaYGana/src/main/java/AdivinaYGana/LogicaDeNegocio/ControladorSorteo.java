package AdivinaYGana.LogicaDeNegocio;

import AdivinaYGana.Modelo.Sorteo;
import DAO.SorteoDAO;

import java.sql.SQLException;
import java.util.List;

public class ControladorSorteo {
    public boolean crearSorteo(int ganador_id, double resultado, int numero) throws SQLException {
        SorteoDAO sorteoDAO = new SorteoDAO();
        return sorteoDAO.create(new Sorteo(ganador_id, resultado, numero));
    }

    public List<Sorteo> getSorteos() throws SQLException{
        SorteoDAO sorteoDAO = new SorteoDAO();
        return sorteoDAO.readAll();
    }
}
