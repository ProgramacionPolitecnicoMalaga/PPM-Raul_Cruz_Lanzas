import java.util.ArrayList;

public class Mesa {
    private int numeroMesa;
    private boolean cerrada;
    private ArrayList<Producto> listaProductos;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        cerrada = true;
        listaProductos = new ArrayList<>();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public ArrayList<Producto> getProductos() {
        return listaProductos;
    }

    public void setProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void añadirProductos(Producto producto){
        listaProductos.add(producto);
        cerrada = false;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numeroMesa=" + numeroMesa +
                ", cerrada=" + cerrada +
                ", productos=" + listaProductos +
                '}';
    }
}
