package Vista;

import Controlador.ItemControlador;
import Modelo.Item;
import Modelo.Tipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Principal {
    private JList listItems;
    private JButton butEliminar;
    private JButton butNuevo;
    private JPanel panelMain;
    private JButton butBuscar;
    private JTextField txtBusqueda;
    private HashMap<Integer, Item> listaItems;
    static final Tipo tipoIT = new Tipo(Tipo.IT);
    static final Tipo tipoDesarrollo = new Tipo(Tipo.DESARROLLO);
    static final Tipo tipoMantenimiento = new Tipo(Tipo.MANTENIMIENTO);
    static final Tipo tipoGeneral = new Tipo(Tipo.GENERAL);

    public Principal() throws SQLException {
        ItemControlador itemControlador = new ItemControlador();
        listaItems = new HashMap<>();
        DefaultListModel<Item> listModel = new DefaultListModel<>();
        listItems.setModel(listModel);
        listItems.setCellRenderer(new ItemPanel());
        listItems.setFixedCellWidth(panelMain.getWidth());

        butNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialogo dialogo = new Dialogo();
                Item item = dialogo.getNuevoItem();
                if(item != null){
                    try{
                        itemControlador.crearItem(item.getAutor(), item.getFecha(), item.getTexto(), item.getTipo().getId());
                    } catch (SQLException e1){
                        e1.printStackTrace();
                    }
                    listModel.addElement(item);
                }
            }
        });

        butBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    listModel.removeAllElements();
                    ArrayList<Item> listaResultadoItems = itemControlador.buscarItem(txtBusqueda.getText());
                    for(Item item : listaResultadoItems){
                        listModel.addElement(item);
                    }
                } catch (SQLException e2){
                    e2.printStackTrace();
                }
            }
        });

        butEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Item item;
                try{
                    ArrayList<Item> listItemTemp = itemControlador.buscarItem(" ");
                    for(int i = 0;i < listItemTemp.size(); i++){
                        listaItems.put(i, listItemTemp.get(i));
                    }
                    item = listaItems.get(listItems.getSelectedIndex());
                    itemControlador.eliminarItem(item.getAutor(), item.getFecha(), item.getTexto(), item.getTipo().getId());
                    listModel.removeElementAt(listItems.getSelectedIndex());
                } catch (SQLException e3){
                    e3.printStackTrace();
                }
            }
        });

        listItems.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                listItems.setFixedCellHeight(1000);
                listItems.setFixedCellHeight(-1);
            }
        });
    }

    public JPanel getPanelMain(){
        return panelMain;
    }

    private static class TipoCellRenderer extends DefaultListCellRenderer{
        public Component getListCellRendererComponent (JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            switch (((Item)value).getTipo().getId()){
                case Tipo.IT: component.setBackground(Color.green);
                    break;
                case Tipo.DESARROLLO: component.setBackground(Color.blue);
                    break;
                case Tipo.MANTENIMIENTO: component.setBackground(Color.black);
                    break;
                case Tipo.GENERAL: component.setBackground(Color.orange);
                    break;
            }
            return component;
        }
    }
}
