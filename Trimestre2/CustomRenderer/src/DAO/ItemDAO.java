package DAO;
import Modelo.Item;
import Modelo.Tipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ItemDAO {
    DbConn dbConn;

    public ItemDAO() throws SQLException {
        dbConn = DbConn.getInstance();
    }

    public void registrarItem(String autor, LocalDate fecha, String comentario, int tipo) throws SQLException{
        dbConn.update("INSERT INTO Item(autor, fecha, comentario, tipo) VALUES('"+ autor +"','" + fecha +"','"+ comentario +"','"+ tipo +"')");
    }

    public void eliminarItem(String autor, LocalDate fecha, String comentario, int tipo) throws SQLException {
        dbConn.update("DELETE FROM Item WHERE autor = '" + autor +"' && fecha = '" + fecha +"' && comentario = '"+ comentario +"' && tipo = '"+ tipo +"'");
    }

    public ArrayList<Item> obtenerListadoCompletoItems() throws SQLException {
        ResultSet rs = dbConn.read("SELECT * FROM Item");
        return obtenerListado(rs);
    }

    public ArrayList<Item> obtenerItemsPorPatron(String patron) throws SQLException{
        ResultSet rs = dbConn.read("SELECT * FROM Item WHERE autor LIKE '%" + patron + "%'");
        return obtenerListado(rs);
    }

    public ArrayList<Item> obtenerListado (ResultSet rs) throws SQLException{
        ArrayList<Item> listaEmpleados = new ArrayList<>();
        while (rs.next()) {
            Item item = new Item(rs.getString("autor"), LocalDate.parse(rs.getString("fecha")), rs.getString("comentario"), new Tipo(rs.getInt("tipo")));
            item.getTipo().setTipoPorId(rs.getInt("tipo"));
            listaEmpleados.add(item);
        }
        return listaEmpleados;
    }
}
