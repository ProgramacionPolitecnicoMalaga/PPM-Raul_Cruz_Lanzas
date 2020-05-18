package com.politecnico.Vista;

import com.politecnico.DataTransfer.DataTransfer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoActualizarRack extends JDialog {
    private JPanel panelMain;
    private JTextField txtNombre;
    private JTextField txtTipo;
    private JButton butOk;
    private JButton butCancel;
    private JLabel lblNombre;
    private JLabel lblTipo;
    private DataTransfer dataTransfer;

    public DialogoActualizarRack(DataTransfer dataTransfer){
        setContentPane(panelMain);
        setModal(true);
        getRootPane().setDefaultButton(butOk);

        this.dataTransfer = dataTransfer;

        butOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOk();
            }
        });

        butCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
    }

    private void onCancel() {
        dispose();
    }

    private void onOk() {
        dataTransfer.nombre = txtNombre.getText();
        dataTransfer.tipo = txtTipo.getText();
        dispose();
    }
}

