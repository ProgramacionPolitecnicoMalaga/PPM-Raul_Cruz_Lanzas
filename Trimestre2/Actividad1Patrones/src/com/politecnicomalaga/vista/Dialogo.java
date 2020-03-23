package com.politecnicomalaga.vista;

import com.politecnicomalaga.controlador.ControladorEmpleados;
import com.politecnicomalaga.modelo.Empleado;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private ControladorEmpleados controladorEmpleados = new ControladorEmpleados();

    public Dialogo(Empleado empleado) throws SQLException {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        txtId.isDisplayable();
        txtId.setText(String.valueOf(empleado.getId()));
        txtNombre.setText(empleado.getNombre());
        txtEdad.setText(String.valueOf(empleado.getEdad()));

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOKModificar();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public Dialogo() throws SQLException {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        txtId.setEnabled(false);
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOKInsertar();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOKInsertar() throws SQLException {
        // add your code here
        controladorEmpleados.crearEmpleado(txtNombre.getText(),txtEdad.getText());
        dispose();
    }

    private void onOKModificar() throws SQLException {
        controladorEmpleados.editarEmpleado(txtId.getText(), txtNombre.getText(), txtEdad.getText());
        dispose();
    }
    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public String getNombre(){
        pack();
        setVisible(true);  // Bloqueo la ventana
        dispose();
        return txtNombre.getText();
    }
}
