package Vista;

import Modelo.Item;
import Modelo.Tipo;

import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Dialogo extends JDialog{
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private JPanel panelMain;
    private JTextField txtAutor;
    private JTextField txtFecha;
    private JTextField txtTexto;
    private JComboBox comboBox1;
    private JLabel lblAutor;
    private JLabel lblFecha;
    private JLabel lblTexto;
    private JLabel lblTipo;
    private JButton butCancelar;
    private JButton butAceptar;
    private Item nuevoItem;

    public Dialogo(){
        setContentPane(panelMain);
        setModal(true);
        getRootPane().setDefaultButton(butAceptar);
        Tipo it = new Tipo(Tipo.IT);
        it.setTipoPorId(Tipo.IT);
        Tipo desarrollo = new Tipo(Tipo.DESARROLLO);
        desarrollo.setTipoPorId(Tipo.DESARROLLO);
        Tipo mantenimiento = new Tipo(Tipo.MANTENIMIENTO);
        mantenimiento.setTipoPorId(Tipo.MANTENIMIENTO);
        Tipo general = new Tipo(Tipo.GENERAL);
        general.setTipoPorId(Tipo.GENERAL);
        comboBox1.addItem(it);
        comboBox1.addItem(desarrollo);
        comboBox1.addItem(mantenimiento);
        comboBox1.addItem(general);

        butAceptar.addActionListener(new ActionListener() {
            @Override
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

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        panelMain.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        nuevoItem = new Item(txtAutor.getText(), LocalDate.parse(txtFecha.getText(), formatter), txtTexto.getText(), (Tipo)(comboBox1.getSelectedItem()));
        setVisible(false);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public Item getNuevoItem(){
        pack();
        setVisible(true);
        dispose();
        return nuevoItem;
    }
}
