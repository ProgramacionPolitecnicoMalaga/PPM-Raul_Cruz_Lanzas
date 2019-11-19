package Actividad12;

public class PersonasFisicas extends Compradores {
    private static final double precioCompra = 0;
    String apellidos;
    String DNI;
    String direccion;

    public PersonasFisicas (String nombre, String apellidos, String DNI, String dirrecion){
        super(nombre, precioCompra, nombre);
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = dirrecion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
