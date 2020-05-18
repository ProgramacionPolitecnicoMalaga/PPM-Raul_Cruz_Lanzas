package com.politecnico.Vista;

import com.politecnico.DataTransfer.DataTransfer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoNuevoRack extends JDialog {
    private JTextField txtEtiqueta;
    private JTextField txtTipo;
    private JButton butOk;
    private JButton butCancel;
    private JLabel lblEtiqueta;
    private JLabel lblTipo;
    private JPanel panelMain;
    private DataTransfer dataTransfer;

    public DialogoNuevoRack(DataTransfer dataTransfer){
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
        dataTransfer.etiqueta = txtEtiqueta.getText();
        dataTransfer.tipo = txtTipo.getText();
        dispose();
    }
}
