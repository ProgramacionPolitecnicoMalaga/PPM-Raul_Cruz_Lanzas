package Criterios;

import Modelo.LoteDeProductos;
import Modelo.Producto;

public class MejorRelacionValoracionPrecio implements SeleccionMejorProducto {
    @Override
    public LoteDeProductos elegirMejoresProductos() {
        LoteDeProductos productosActuales = LoteDeProductos.getInstancia();
        LoteDeProductos filtrado = new LoteDeProductos();
        double mejorVP = Double.MIN_VALUE;
        double temp;
        int resultado = 0;
        for(Producto producto: productosActuales.getListaProductos()){
            temp = producto.getValoracion() / producto.getPrecio();
            if(temp > mejorVP){
                System.out.println(temp);
                mejorVP = temp;
                resultado = productosActuales.getListaProductos().indexOf(producto);
            }
        }
        filtrado.addProducto(productosActuales.getProductosEnPosicion(resultado));
        return filtrado;
    }
}
