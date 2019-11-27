package Actividad18;

import java.util.Comparator;
import java.util.TreeSet;

public class ListaEspera{

    public  static Comparator<Paciente> ListaEspera = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente paciente, Paciente p1) {
            if(paciente.isIncidenciaGravedad()){
                paciente.setPrioridad(0);
            }
            if (paciente.getPrioridad() - p1.getPrioridad() == 0) {
                return paciente.getNombre().compareTo(p1.getNombre());
            }
            else {
                return paciente.getPrioridad() - p1.getPrioridad();
            }
        }};

    static TreeSet<Paciente> listaEspera = new TreeSet<>(ListaEspera);

    public static void main(String[] args) {

        listaEspera.add(new Paciente("Andres", 20, 1, false));
        listaEspera.add(new Paciente("Marcos", 13, 11, false));
        listaEspera.add(new Paciente("Borja", 2, 10, true));
        listaEspera.add(new Paciente("Pablo", 40, 3, false));
        listaEspera.add(new Paciente("Raul", 19, 3, false));

        for(Paciente P : listaEspera){
            System.out.println(P);
        }
    }
}
