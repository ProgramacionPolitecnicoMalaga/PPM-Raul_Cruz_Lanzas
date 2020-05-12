package Composite;

public class Productos implements Servicio {
    private String nombre;
    private double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void colocarPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double conseguirPrecio() {
        return precio;
    }

    @Override
    public int getTipo() {
        return Servicio.Tipo_Productos;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
