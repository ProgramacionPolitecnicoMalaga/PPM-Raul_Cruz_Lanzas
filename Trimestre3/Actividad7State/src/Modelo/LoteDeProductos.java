package Modelo;

import java.util.ArrayList;

public class LoteDeProductos {
    private ArrayList<Producto> listaProductos;
    public static LoteDeProductos instancia = null;

    public LoteDeProductos(){
        listaProductos = new ArrayList<>();
    }

    public static LoteDeProductos getInstancia(){
        if(instancia == null){
            instancia = new LoteDeProductos();
        }
        return instancia;
    }

    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }

    public int getTotalProductos(){
        return listaProductos.size();
    }

    public Producto getProductosEnPosicion(int posicion){
        return listaProductos.get(posicion);
    }

    public void addProducto(Producto producto){
        listaProductos.add(producto);
    }

    @Override
    public String toString() {
        return "LoteDeProductos{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
