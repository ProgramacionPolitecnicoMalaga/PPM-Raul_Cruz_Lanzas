package Modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int valoracion;

    public Producto(String nombre, double precio, int valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", valoracion=" + valoracion +
                '}';
    }
}
