package Actividad18;

import java.nio.file.DirectoryNotEmptyException;
import java.util.Comparator;

public class Paciente {
    String nombre;
    int edad;
    int idEspecialidad;
    boolean incidenciaGravedad;
    int prioridad;

    public Paciente(String nombre, int edad, int idEspecialidad, boolean incidenciaGravedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEspecialidad = idEspecialidad;
        this.incidenciaGravedad = incidenciaGravedad;
        this.prioridad = idEspecialidad;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public boolean isIncidenciaGravedad() {
        return incidenciaGravedad;
    }

    public void setIncidenciaGravedad(boolean incidenciaGravedad) {
        this.incidenciaGravedad = incidenciaGravedad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", idEspecialidad=" + idEspecialidad +
                ", incidenciaGravedad=" + incidenciaGravedad +
                ", prioridad=" + prioridad +
                '}';
    }
}
