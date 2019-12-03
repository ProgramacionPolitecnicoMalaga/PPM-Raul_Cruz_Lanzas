import java.util.LinkedList;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private double productividad;
    private CategoriaEmpleado categoriaEmpleado;
    private LinkedList<Tarea> listaTareas = new LinkedList<>();

    public Empleado(String nombre, String apellidos, String DNI, double productividad, CategoriaEmpleado categoriaEmpleado){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.productividad = productividad;
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public LinkedList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(LinkedList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
