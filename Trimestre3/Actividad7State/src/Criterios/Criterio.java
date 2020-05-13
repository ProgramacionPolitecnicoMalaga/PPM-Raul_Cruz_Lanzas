package Criterios;

import Modelo.LoteDeProductos;

public class Criterio {
    private SeleccionMejorProducto seleccionMejorProducto;

    public void setSeleccionMejorProducto(SeleccionMejorProducto seleccionMejorProducto){
        this.seleccionMejorProducto = seleccionMejorProducto;
    }

    public LoteDeProductos getProductoSegunElCriterio(){
        return seleccionMejorProducto.elegirMejoresProductos();
    }
}
