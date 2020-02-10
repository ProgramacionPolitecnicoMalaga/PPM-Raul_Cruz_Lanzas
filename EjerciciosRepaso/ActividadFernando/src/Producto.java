import java.util.ArrayList;

public class Producto {
    public Cafeteria cafeteria;
    private String nombre;
    private double precio;
    private ArrayList<Producto> listaProductos;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        listaProductos = new ArrayList<>();
    }

    public void añadirProductos(String nombre, double precio){
        listaProductos.add(new Producto(nombre, precio));
        System.out.println("Producto añadido");
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

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
