import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;

public class ListaEmpleadoTarea {
    TreeMap<Empleado, LinkedList<Tarea>> mapaEmpleadoTarea = new TreeMap<Empleado, LinkedList<Tarea>>(new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado tarea) {
            return empleado.getDNI().compareTo(tarea.getDNI());
        }
    });

    public ListaEmpleadoTarea(){

    }
}
