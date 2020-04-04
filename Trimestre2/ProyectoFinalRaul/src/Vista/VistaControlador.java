package Vista;

import ControladorGeneralConsultas.ControladorConsultas;
import Modelo.Credencial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class VistaControlador implements ActionListener {
    private ControladorConsultas servicio;
    private Principal vista;

    public VistaControlador(ControladorConsultas servicio, Principal vista) throws SQLException {
        this.servicio = servicio;
        this.vista = vista;
        this.vista.cargarTodosLosDatos(servicio.mostrarTodos());
    }

    public void crearDialogoRegistro() throws NoSuchAlgorithmException, SQLException {
        DataTransfer datos = new DataTransfer();
        DialogoRegistrar dialogo = new DialogoRegistrar(datos);
        String nombre = (String) datos.getDato("nombre");
        String clave = (String) datos.getDato("clave");
        String algoritmo = (String) datos.getDato("algoritmo");
        servicio.addCredencial(nombre, clave, algoritmo);
        vista.cargarTodosLosDatos(servicio.mostrarTodos());
    }

    public void crearDialogoValidar() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DialogoValidar dialogo = new DialogoValidar(datos);
        String nombre = (String) datos.getDato("nombre");
        String clave = (String) datos.getDato("clave");
        Credencial usuario = servicio.buscarUsuario(nombre);
        boolean verificar = servicio.verificarEncriptador(clave,usuario.getAlgoritmo(),usuario);
        vista.setLabelsPaneIcon(verificar);
        vista.cargarDatosUsuario(usuario);
    }

    public void eliminarUsuarioSeleccionado() throws SQLException {
        Credencial usuario = servicio.buscarUsuario(vista.getdataSelectedNick());
        servicio.eliminarUusario(usuario.getNombre());
        vista.getDefaultModelToRemoveNicks();
        vista.cargarTodosLosDatos(servicio.mostrarTodos());
    }

    public void cargarNicks() {
        Credencial usuario = servicio.buscarUsuario(vista.getdataSelectedNick());
        vista.cargarDatosUsuario(usuario);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("registrar")) {
            try {
                crearDialogoRegistro();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("validar")) {
            try {
                crearDialogoValidar();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("eliminar")) {
            try {
                eliminarUsuarioSeleccionado();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("cargar")) {
            cargarNicks();

        }
    }
}
