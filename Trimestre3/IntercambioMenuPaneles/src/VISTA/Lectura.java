package VISTA;

import EXCEPTIONS.ConexionException;
import MODELO.Mensaje;
import SERVICIO.Servicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.net.ConnectException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lectura {
    private JPanel pnlLectura;
    private JList listRemitente;
    private JTextArea txtMensaje;
    private JButton butCargarMensajes;
    private DefaultListModel<String> defaultListMensajesNombres;
    private Servicio servicio;

    public Lectura(){
        this.servicio = new Servicio();
        this.defaultListMensajesNombres = new DefaultListModel<>();
        this.listRemitente.setModel(this.defaultListMensajesNombres);
        this.listRemitente.setFixedCellHeight(pnlLectura.getWidth());
        this.listRemitente.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                listRemitente.setFixedCellHeight(1000);
                listRemitente.setFixedCellHeight(-1);
            }
        });
        cargarDatosJlist();

        butCargarMensajes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                cargarDatosTxtArea();
                cargarDatosJlist();
            } catch (ConexionException ex){
                ex.printStackTrace();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        });
    }

    public JPanel getPnlLectura(){
        return pnlLectura;
    }

    public void cargarDatosJlist(){
        defaultListMensajesNombres.removeAllElements();
        ArrayList<Mensaje> mensajes = servicio.enseñarMensaje();
        for(Mensaje mensaje: mensajes){
            defaultListMensajesNombres.addElement(mensaje.getEmisor());
        }
    }

    public void cargarDatosTxtArea() throws ConexionException, SQLException{
        txtMensaje.removeAll();
        Mensaje mensaje = servicio.encontrarMensaje(listRemitente.getSelectedValue().toString());
        txtMensaje.setText(mensaje.getTitulo() + "\n" + mensaje.getTexto());
    }
}
