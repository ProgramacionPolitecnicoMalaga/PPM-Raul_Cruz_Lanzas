package com.politecnico.Vista;

import com.politecnico.DataTransfer.DataTransfer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoNuevoServidor extends JDialog {
    private JPanel panelMain;
    private JTextField txtIP;
    private JTextField txtCoste;
    private JButton butOk;
    private JButton butCancel;
    private JLabel lblIP;
    private JLabel lblCoste;
    private DataTransfer dataTransfer;

    public DialogoNuevoServidor(DataTransfer dataTransfer){
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
        dataTransfer.ip = txtIP.getText();
        dataTransfer.coste = txtCoste.getColumns();
        dispose();
    }
}
