package PackHotel;

import Builder.TipoPack;

public class Pack {
    private TipoPack tipoPack = null;
    private boolean Desayuno = false;
    private boolean Almuerzo = false;
    private boolean Cena = false;
    private boolean Habitacion_simple = false;
    private boolean Habitacion_doble = false;
    private boolean Habitacion_suite = false;
    private boolean Cama_adicional = false;
    private boolean Parque_atracciones = false;
    private boolean Curso_surf = false;
    private boolean Actividades_infantiles = false;
    private boolean Cine_en_playa = false;

    public void setTipoPack(TipoPack tipoPack){
        this.tipoPack = tipoPack;
    }

    public void setDesayuno() {
        Desayuno = true;
    }

    public void setAlmuerzo() {
        Almuerzo = true;
    }

    public void setCena() {
        Cena = true;
    }

    public void setHabitacion_simple() {
        Habitacion_simple = true;
    }

    public void setHabitacion_doble() {
        Habitacion_doble = true;
    }

    public void setHabitacion_suite() {
        Habitacion_suite = true;
    }

    public void setCama_adicional() {
        Cama_adicional = true;
    }

    public void setParque_atracciones() {
        Parque_atracciones = true;
    }

    public void setCurso_surf() {
        Curso_surf = true;
    }

    public void setActividades_infantiles() {
        Actividades_infantiles = true;
    }

    public void setCine_en_playa() {
        Cine_en_playa = true;
    }

    @Override
    public String toString() {
        return "Pack{" +
                "tipoPack=" + tipoPack +
                ", Desayuno=" + Desayuno +
                ", Almuerzo=" + Almuerzo +
                ", Cena=" + Cena +
                ", Habitacion_simple=" + Habitacion_simple +
                ", Habitacion_doble=" + Habitacion_doble +
                ", Habitacion_suite=" + Habitacion_suite +
                ", Cama_adicional=" + Cama_adicional +
                ", Parque_atracciones=" + Parque_atracciones +
                ", Curso_surf=" + Curso_surf +
                ", Actividades_infantiles=" + Actividades_infantiles +
                ", Cine_en_playa=" + Cine_en_playa +
                '}';
    }
}
