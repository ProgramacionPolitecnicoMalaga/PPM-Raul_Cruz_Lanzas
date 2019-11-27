package Actividad18;

import java.util.PriorityQueue;

public class Urgencia {
    private String especialidad;
    private int idEspacialidad = 0;

    public Urgencia(int idEspecialidad, String especialidad){
        this.idEspacialidad = idEspacialidad;
        this.especialidad = especialidad;
    }

    public int getIdEspacialidad() {
        return idEspacialidad;
    }

    public void setIdEspacialidad(int idEspacialidad) {
        this.idEspacialidad = idEspacialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
