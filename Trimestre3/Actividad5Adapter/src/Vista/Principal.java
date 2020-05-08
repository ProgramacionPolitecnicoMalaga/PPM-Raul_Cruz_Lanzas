package Vista;

import Adapter.Adapter;
import Modelo.Personas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Principal {
    private JPanel panelMain;
    private JTable tblPersonas;
    private JButton butBorrar;
    private JButton butOutPrintPersonas;
    private JButton butInsertar;
    public ArrayList<Personas> listaPersonas;

    public JPanel getPanelMain(){
        return panelMain;
    }

    public Principal(ArrayList<Personas> listaPersonas){
        this.listaPersonas = listaPersonas;
        Adapter adapter = new Adapter(listaPersonas);
        tblPersonas.setModel(adapter);

        butBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tblPersonas.getSelectedRow() != -1){
                    adapter.eliminarFila(tblPersonas.getSelectedRow());
                }
            }
        });

        butOutPrintPersonas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-----------");
                System.out.println("La lista actual es: \n");
                for(Personas personas : listaPersonas) System.out.println(personas);{
                    System.out.println("--------------");
                }
            }
        });

        butInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adapter.añadirFila();
            }
        });

        tblPersonas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_DELETE){
                    tblPersonas.getCellEditor().stopCellEditing();
                    adapter.eliminarFila(tblPersonas.getSelectedRow());
                }
            }
        });
    }
}
