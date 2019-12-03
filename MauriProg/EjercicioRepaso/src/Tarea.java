public class Tarea {
    private String nombreTarea;
    private String descripcionTarea;
    private double horasEmpleadas;
    private Proyecto proyecto;
    private Empleado empleado;

    public Tarea(String nombreTarea, String descripcionTarea, double horasEmpleadas, Empleado empleado, Proyecto proyecto){
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.horasEmpleadas = horasEmpleadas;
        this.proyecto = proyecto;
        this.empleado = empleado;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public double getHorasEmpleadas() {
        return horasEmpleadas;
    }

    public void setHorasEmpleadas(double horasEmpleadas) {
        this.horasEmpleadas = horasEmpleadas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return nombreTarea;
    }
}
