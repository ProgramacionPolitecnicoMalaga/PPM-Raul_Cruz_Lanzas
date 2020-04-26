package VISTA;

import SERVICIO.Login;

import javax.swing.*;

public class PanelPrincipal extends JPanel {

    private JPanel pnlIntercambio;
    private JMenu menuAcciones;
    private JMenuItem menuPanelLectura;
    private JMenuItem menuPanelEscritura;
    private JPanel jPanel;
    private JTextField txtNombre;
    private JPasswordField passwordFieldClave;
    private JButton butAceptar;
    private Escritura escritura;
    private Lectura lectura;
    private Login login;
}
