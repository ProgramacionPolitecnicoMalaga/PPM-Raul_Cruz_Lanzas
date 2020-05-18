package com.politecnico;

import com.politecnico.Vista.Principal;

import javax.swing.*;

public class App
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame("Servidores");
        frame.setContentPane(new Principal().getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
