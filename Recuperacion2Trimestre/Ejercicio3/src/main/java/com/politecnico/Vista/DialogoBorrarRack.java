package com.politecnico.Vista;

import com.politecnico.DataTransfer.DataTransfer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoBorrarRack extends JDialog{
    private JPanel panelMain;
    private JButton butOk;
    private JButton butCancel;
    private JLabel lblPregunta;
    private DataTransfer dataTransfer;

    public DialogoBorrarRack(DataTransfer dataTransfer){
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
        dispose();
    }
}
