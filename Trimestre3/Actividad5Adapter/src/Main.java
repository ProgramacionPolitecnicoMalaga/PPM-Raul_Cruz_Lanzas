import Modelo.Personas;
import Vista.Principal;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Personas> añadir(){
        ArrayList<Personas> personas = new ArrayList<>();
        personas.add(new Personas("Pepe", "Villuela", 50));
        personas.add(new Personas("Juan", "García", 33));
        personas.add(new Personas("Pedro", "Andrés", 44));
        personas.add(new Personas("Carla", "Prieto", 43));
        return personas;
    }

    public static void main(String[] args) {
        Principal principal = new Principal(añadir());
        JFrame frame = new JFrame("Tabla");
        frame.setContentPane(principal.getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
