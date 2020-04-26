package VISTA;

import MODELO.Credencial;
import SERVICIO.Servicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Escritura {
    private JPanel pnlEscritura;
    private JComboBox cmboxDestinatario;
    private JTextArea txtEscribirMensajes;
    private JTextField txtTitulo;
    private JButton butEnviar;
    private JTextField txtEmisor;
    private JTextField txtFecha;

    public Escritura(){
        addNombreBox();
        butEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    escribirMensaje();
                } catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPnlEscritura(){
        return pnlEscritura;
    }

    public void addNombreBox(){
        Servicio servicio = new Servicio();
        ArrayList<Credencial> credencials = servicio.mostrarNombreCredencial();
        for(Credencial credencial : credencials){
            cmboxDestinatario.addItem(credencial.getNombre());
        }
    }

    public void escribirMensaje() throws SQLException{
        Servicio servicio = new Servicio();
        String titulo = txtTitulo.getText();
        String texto = txtEscribirMensajes.getText();
        String emisor = txtEmisor.getText();
        String receptor = cmboxDestinatario.getSelectedItem().toString();
        String fecha = txtFecha.getText();
        int idRemitente = servicio.buscarIdCredencial(emisor);
        servicio.agregarMensaje(titulo, texto, emisor, receptor, fecha, idRemitente);
    }
}
