package com.politecnico.Vista;

import com.politecnico.DataTransfer.DataTransfer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

    private JPanel panelMain;
    private JList listPrincipal;
    private JList listSecundaria;
    private JButton butNuevoRack;
    private JButton butBorrarRack;
    private JButton butActualizarRack;
    private JButton butNuevoServidor;
    private JTextField txtTotal;
    private JLabel lblTotal;
    private DefaultListModel<String> listModel;
    private DefaultListModel<String> listModel2;

    public Principal(){
        listModel = new DefaultListModel<>();
        listModel2 = new DefaultListModel<String>();
        listPrincipal.setModel(listModel);
        listSecundaria.setModel(listModel2);

        butNuevoRack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataTransfer dataTransfer = new DataTransfer();
                DialogoNuevoRack dialogoNuevoRack = new DialogoNuevoRack(dataTransfer);
                dialogoNuevoRack.pack();
                dialogoNuevoRack.setLocationRelativeTo(panelMain);
                dialogoNuevoRack.setVisible(true);
                listModel.addElement(dataTransfer.etiqueta);
                listModel.addElement(dataTransfer.tipo);
            }
        });

        butBorrarRack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataTransfer dataTransfer = new DataTransfer();
                DialogoBorrarRack dialogoBorrarRack = new DialogoBorrarRack(dataTransfer);
                dialogoBorrarRack.pack();
                dialogoBorrarRack.setLocationRelativeTo(panelMain);
                dialogoBorrarRack.setVisible(true);
                listModel.removeAllElements();
            }
        });

        butActualizarRack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataTransfer dataTransfer = new DataTransfer();
                DialogoActualizarRack dialogoActualizarRack = new DialogoActualizarRack(dataTransfer);
                dialogoActualizarRack.pack();
                dialogoActualizarRack.setLocationRelativeTo(panelMain);
                dialogoActualizarRack.setVisible(true);
                listModel.addElement(dataTransfer.nombre);
                listModel.addElement(dataTransfer.tipo);
            }
        });

        butNuevoServidor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataTransfer dataTransfer = new DataTransfer();
                DialogoNuevoServidor dialogoNuevoServidor = new DialogoNuevoServidor(dataTransfer);
                dialogoNuevoServidor.pack();
                dialogoNuevoServidor.setLocationRelativeTo(panelMain);
                dialogoNuevoServidor.setVisible(true);
                listModel2.addElement(dataTransfer.ip);
                listModel2.addElement(String.valueOf(dataTransfer.coste));
            }
        });
    }

    public Container getPanelMain(){
        return panelMain;
    }
}
