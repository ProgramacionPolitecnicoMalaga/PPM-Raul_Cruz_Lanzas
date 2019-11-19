package Actividad12;

public class Compradores {
    private String nombre;
    private double precioCompra;
    private String fechaCompra;

    public Compradores(String nombre, double precioCompra, String fechaCompra){
        this.nombre = this.nombre;
        this.precioCompra = precioCompra;
        this.fechaCompra = fechaCompra;
    }

    public void setPrecioCompra(double precioCompra){
        this.precioCompra=precioCompra;
    }

    public void setFechaCompra(String fechaCompra){
        this.fechaCompra=fechaCompra;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }

    public String getFechaCompra(){
        return fechaCompra;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nombre='" + nombre + '\'' +
                ", precioCompra=" + precioCompra +
                ", fechaCompra='" + fechaCompra + '\'' +
                '}';
    }

    public void setPrecioFecha(String fecha) {
    }
}
