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
                    System.out.println(fibonacci(i) + " ");
                }
                System.out.println();
            }
        });
    }

    public int Fibonacci(int n, int fiboacci){
        if(n > 1){
            return fibonacci(n-1)+ fibonacci(n-2);
        } else if(n==1){
            return 1;
        } else if(n==0){
            return 0;
        } else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    private int fibonacci(int i) {
        return i;
    }

    public Container getPanelMain(){
        return panelMain;
    }
}
