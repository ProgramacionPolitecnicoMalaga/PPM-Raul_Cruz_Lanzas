package Vista;

import Modelo.Credencial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

public class Principal extends JFrame {
    private JPanel panel;
    private JList listNombres;
    private JButton butRegistrar;
    private JButton butValidar;
    private JButton butBorrar;
    private JList listDatos;
    private JButton butCargar;
    private UsuarioPanel usuarioPanel;
    private DefaultListModel<Credencial> defaultListModelDatos;
    private DefaultListModel<String> defaultListModelNombres;

    public Principal(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        defaultListModelDatos = new DefaultListModel<>();
        defaultListModelNombres = new DefaultListModel<>();
        usuarioPanel = new UsuarioPanel();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        this.listDatos.updateUI();
        this.listNombres.updateUI();
        this.setPreferredSize(new Dimension(300,  toolkit.getScreenSize().height - 200));
        this.setMinimumSize(new Dimension(300,200));
        listDatos.setModel(defaultListModelDatos);
        listDatos.setCellRenderer(usuarioPanel);
        listNombres.setModel(defaultListModelNombres);
        listDatos.setFixedCellWidth(panel.getWidth());
        listDatos.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                listDatos.setFixedCellHeight(1000);
                listDatos.setFixedCellHeight(-1);
            }
        });
    }

    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int getjListNicks() {
        return listNombres.getAnchorSelectionIndex();
    }

    public Object getDefaultModelToRemoveNicks() {
        return defaultListModelNombres.remove(getjListNicks());
    }

    public void setLabelsPaneIcon(boolean resultado) {
        usuarioPanel.setLabelsPassword(resultado);

    }
    public void cargarDatosUsuario(Credencial usuario) {
        defaultListModelDatos.removeAllElements();
        defaultListModelDatos.addElement(usuario);
    }

    public void cargarTodosLosDatos(ArrayList<Credencial> usuarios) {
        defaultListModelDatos.removeAllElements();
        defaultListModelNombres.removeAllElements();
        for (Credencial usuario : usuarios) {
            defaultListModelNombres.addElement(usuario.getNombre());
        }
    }

    public String getdataSelectedNick() {
        return listNombres.getSelectedValue().toString();
    }

    public void setActionListenerControlador(ActionListener actionListener) {
        butRegistrar.addActionListener(actionListener);
        butRegistrar.setActionCommand("registrar");
        butValidar.addActionListener(actionListener);
        butValidar.setActionCommand("validar");
        butBorrar.addActionListener(actionListener);
        butBorrar.setActionCommand("eliminar");
        butCargar.addActionListener(actionListener);
        butCargar.setActionCommand("cargar");
    }
}
