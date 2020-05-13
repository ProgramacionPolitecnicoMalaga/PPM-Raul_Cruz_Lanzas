package Criterios;

import Modelo.LoteDeProductos;
import Modelo.Producto;

public class MejorValorado implements SeleccionMejorProducto{
    @Override
    public LoteDeProductos elegirMejoresProductos() {
        LoteDeProductos productosActuales = LoteDeProductos.getInstancia();
        LoteDeProductos filtrado = new LoteDeProductos();
        double masAlto = Double.MIN_VALUE;
        int resultado = 0;
        for(Producto producto: productosActuales.getListaProductos()){
            if(producto.getValoracion() > masAlto){
                masAlto = producto.getValoracion();
                resultado = productosActuales.getListaProductos().indexOf(producto);
            }
        }
        filtrado.addProducto(productosActuales.getProductosEnPosicion(resultado));
        return filtrado;
    }
}
