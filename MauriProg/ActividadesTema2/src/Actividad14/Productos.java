package Actividad14;

public class Productos extends LoteProductos{
    String nombre;
    int precio;
    int indiceValoracion;

    public Productos(String nombre, int precio, int indiceValoracion){
        this.nombre = nombre;
        this.precio = precio;
        this.indiceValoracion = indiceValoracion;
    }

    @Override
    public String toString(){
        return "Nombre del producto: "+nombre+ "\n"+
                "Precio del producto: "+precio+ "\n"+
                "Indice de valoracion del producto: "+indiceValoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIndiceValoracion() {
        return indiceValoracion;
    }

    public void setIndiceValoracion(int indiceValoracion) {
        this.indiceValoracion = indiceValoracion;
    }
}
