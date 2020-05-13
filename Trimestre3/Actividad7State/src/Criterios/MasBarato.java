package Criterios;

import Modelo.LoteDeProductos;
import Modelo.Producto;

public class MasBarato implements SeleccionMejorProducto {
    @Override
    public LoteDeProductos elegirMejoresProductos() {
        LoteDeProductos productosActuales = LoteDeProductos.getInstancia();
        LoteDeProductos filtrado = new LoteDeProductos();
        double masBarato = Double.MAX_VALUE;
        int resultado = 0;
        for(Producto producto: productosActuales.getListaProductos()){
            if(producto.getPrecio() < masBarato){
                masBarato = producto.getPrecio();
                resultado = productosActuales.getListaProductos().indexOf(producto);
            }
        }
        filtrado.addProducto(productosActuales.getProductosEnPosicion(resultado));
        return filtrado;
    }
}
