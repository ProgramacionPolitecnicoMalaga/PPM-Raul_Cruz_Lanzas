package Main;

import ControladorGeneralConsultas.ControladorConsultas;
import Vista.Principal;
import Vista.VistaControlador;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Aplicacion {
    public static void main(String[] args) throws SQLException {
        Principal principal = new Principal();
        ActionListener controlador = new VistaControlador(new ControladorConsultas(), principal);
        principal.setActionListenerControlador(controlador);
        principal.iniciarVista();
    }
}
