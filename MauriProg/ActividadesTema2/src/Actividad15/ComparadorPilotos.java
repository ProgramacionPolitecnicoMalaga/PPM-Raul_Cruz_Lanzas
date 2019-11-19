package Actividad15;

import java.util.Comparator;

public class ComparadorPilotos implements Comparator<Piloto> {

    public int compare(Piloto o1, Piloto o2){
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
