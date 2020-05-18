package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel panelMain;
    private JList listFibonacci;
    private JButton butCalcular;
    private JTextField txtTermino;
    private JLabel lblTermino;
    private int tamaño;
    private String nombre;

    public Principal(){
        butCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i<tamaño; i++){
                    System.out.println(listFibonacci);
                }
            }
        });
    }

    public Container getPanelMain(){
        return panelMain;
    }
}
