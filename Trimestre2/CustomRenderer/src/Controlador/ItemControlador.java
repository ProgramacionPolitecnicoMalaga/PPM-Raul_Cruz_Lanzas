package Controlador;
import DAO.ItemDAO;
import Modelo.Item;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ItemControlador {
    ItemDAO itemDAO;

    public ItemControlador() throws SQLException{
        itemDAO = new ItemDAO();
    }

    public void eliminarItem(String autor, LocalDate fecha, String comentario, int tipo) throws SQLException{
        itemDAO.eliminarItem(autor, fecha, comentario, tipo);
    }

    public void crearItem(String autor, LocalDate fecha, String comentario, int tipo) throws SQLException{
        itemDAO.registrarItem(autor, fecha, comentario, tipo);
    }

    public ArrayList<Item> buscarItem (String cadenaABuscar) throws SQLException{
        ArrayList<Item> listadoEmpleadoFiltado;
        if(cadenaABuscar.equals(" ")){
            listadoEmpleadoFiltado = itemDAO.obtenerListadoCompletoItems();
        } else{
            listadoEmpleadoFiltado = itemDAO.obtenerItemsPorPatron(cadenaABuscar);
        }
        return listadoEmpleadoFiltado;
    }
}
