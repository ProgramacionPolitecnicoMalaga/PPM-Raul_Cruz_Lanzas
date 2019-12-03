public class Proyecto {
    private String nombre;
    private String departamento;
    private String descripcion;
    private double factorProduccion;

    public Proyecto(String nombre, String departamento, String descripcion, double factorProduccion){
        this.nombre = nombre;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.factorProduccion = factorProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getFactorProduccion() {
        return factorProduccion;
    }

    public void setFactorProduccion(double factorProduccion) {
        this.factorProduccion = factorProduccion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
