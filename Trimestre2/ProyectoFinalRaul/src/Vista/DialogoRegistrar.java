package Vista;

import javax.swing.*;
import java.awt.event.*;

public class DialogoRegistrar extends JDialog {
    private JPanel panelMain;
    private JTextField txtNombre;
    private JPasswordField txtPassword;
    private JComboBox cmbAlgoritmo;
    private JButton butOk;
    private JButton butCancelar;
    private DataTransfer dataTransfer;
    public static String clave;

    public DialogoRegistrar(DataTransfer dataTransfer){
        this.dataTransfer = dataTransfer;
        setContentPane(panelMain);
        setModal(true);
        getRootPane().setDefaultButton(butOk);
        cmbAlgoritmo.addItem("SHA");
        cmbAlgoritmo.addItem("BCrypt");
        cmbAlgoritmo.addItem("MD5");

        butOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        butCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        panelMain.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        setLocationRelativeTo(getParent());
        pack();
        setVisible(true);
    }

    private void onOK() {
        dataTransfer.setDato("nombre",txtNombre.getText());
        char[] array = txtPassword.getPassword();
        clave = new String(array);
        dataTransfer.setDato("clave",clave);
        dataTransfer.setDato("algoritmo",cmbAlgoritmo.getSelectedItem().toString());
        dispose();
    }

    private void onCancel() {
        dispose();
    }
}
