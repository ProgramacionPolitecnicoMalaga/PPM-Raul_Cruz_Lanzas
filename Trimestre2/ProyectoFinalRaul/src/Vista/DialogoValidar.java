package Vista;

import javax.swing.*;
import java.awt.event.*;

public class DialogoValidar extends JDialog {

    private JPanel panelMain;
    private JTextField txtNombreV;
    private JPasswordField txtPasswordV;
    private JButton butOk;
    private JButton butCancelar;
    private DataTransfer dataTransfer;

    public DialogoValidar(DataTransfer dataTransfer){
        this.dataTransfer = dataTransfer;
        setContentPane(panelMain);
        setModal(true);
        getRootPane().setDefaultButton(butOk);

        butOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        butCancelar.addActionListener(new ActionListener() {
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
        dataTransfer.setDato("nombre",txtNombreV.getText());
        char[] array = txtPasswordV.getPassword();
        String clave = new String(array);
        dataTransfer.setDato("clave",clave);
        dispose();
    }

    private void onCancel() {
        dispose();
    }
}
