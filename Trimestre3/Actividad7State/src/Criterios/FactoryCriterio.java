package Criterios;

public class FactoryCriterio {
    public static SeleccionMejorProducto getCriterio(int criterio){
        switch (criterio){
            case SeleccionMejorProducto.Mejor_Valorado:
                return new MejorValorado();
            case SeleccionMejorProducto.Mas_Barato:
                return new MasBarato();
            case SeleccionMejorProducto.Mejor_Relacion_Valoracion_Precio:
                return new MejorRelacionValoracionPrecio();
            default:
                return new MejorValorado();
        }
    }
}
