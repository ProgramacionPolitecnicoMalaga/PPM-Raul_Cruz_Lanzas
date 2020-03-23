package com.politecnicomalaga.vista;

import com.politecnicomalaga.controlador.ControladorEmpleados;
import com.politecnicomalaga.modelo.Empleado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class vistaEmpleados {

    private JTextField txtPatronBusqueda;
    private JButton butBuscar;
    private JTable tblEmpleados;
    private JPanel pnlEmpleado;
    private JButton butNuevo;
    private JButton butModificar;
    private JButton butBorrar;
    private ControladorEmpleados controladorEmpleados = new ControladorEmpleados();
    private vistaEmpleados vistaEmpleados;
    private DefaultTableModel modelo;

    public vistaEmpleados() throws SQLException {
        butNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Dialogo dialogo = new Dialogo();
                    String nombre = dialogo.getNombre();
                    actualizarTabla(nombre);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        butModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Empleado empleado= new Empleado(getID(), getNombre(), getEdad());
                    Dialogo dialogo = new Dialogo(empleado);
                    String nombre = dialogo.getNombre();
                    actualizarTabla(nombre);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        butBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    actualizarTabla(txtPatronBusqueda.getText());
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        butBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] listaIds=new String[tblEmpleados.getRowCount()];
                int[] indicesFilasSeleccionadas=tblEmpleados.getSelectedRows();
                for(int i=0; i<indicesFilasSeleccionadas.length; i++){
                    listaIds[i]=tblEmpleados.getValueAt(indicesFilasSeleccionadas[i], 0).toString();
                }
                try {
                    controladorEmpleados.eliminarEmpleado(listaIds);
                    actualizarTabla("");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanel() {
        return pnlEmpleado;
    }

    private void createUIComponents() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[] {"ID", "Nombre", "Edad"});
        tblEmpleados = new JTable(modelo);
        tblEmpleados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public void actualizarTabla(String nombre) throws SQLException {
        ArrayList<Empleado> listaBusquedaEmpleados;
        listaBusquedaEmpleados= controladorEmpleados.getEmpleados(nombre);
        modelo.setRowCount(0);
        for(Empleado empleado: listaBusquedaEmpleados){
            modelo.addRow(new Object[]{empleado.getId(), empleado.getNombre(), empleado.getEdad()});
        }
    }

    public Integer getID(){
        return Integer.parseInt(tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 0).toString());
    }

    public String getNombre(){
        return tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 1).toString();
    }

    public Integer getEdad(){
        return Integer.parseInt(tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 2).toString());
    }
}
