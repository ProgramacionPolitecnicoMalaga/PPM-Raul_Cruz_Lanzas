package Main;

import DAO.ConsultasUsuario;
import Vista.Vista;
import Vista.ControladorVista;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Aplicacion {
    public static void main(String[] args) throws SQLException {
        Vista vista = new Vista();
        ActionListener controlador = new ControladorVista(new ConsultasUsuario(), vista);
        vista.setActionListenerControlador(controlador);
        vista.iniciarVista();
    }
}
