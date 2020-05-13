package Criterios;

import Modelo.LoteDeProductos;

public interface SeleccionMejorProducto{
    public static int Mejor_Valorado = 1;
    public static int Mas_Barato = 2;
    public static int Mejor_Relacion_Valoracion_Precio = 3;

    public LoteDeProductos elegirMejoresProductos();
}
