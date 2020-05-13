import Criterios.Criterio;
import Criterios.FactoryCriterio;
import Criterios.SeleccionMejorProducto;
import Modelo.LoteDeProductos;
import Modelo.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        prueba();
        Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Selecciona una opcion: \n" +
                "1.Mejor valorado \n" +
                "2.Mas barato \n" +
                "3.Mejor relacion valoracion/precio");

        int eleccion = lectorTeclado.nextInt();
        SeleccionMejorProducto seleccionMejorProducto = FactoryCriterio.getCriterio(eleccion);
        Criterio criterio = new Criterio();
        criterio.setSeleccionMejorProducto(seleccionMejorProducto);
        System.out.println(criterio.getProductoSegunElCriterio());
    }

    private static void prueba(){
        LoteDeProductos productos = LoteDeProductos.getInstancia();
        Producto producto1 = new Producto("Play 4", 400, 4);
        Producto producto2 = new Producto("Iphone 11", 900, 5);
        Producto producto3 = new Producto("Portatil PHP", 650, 3);
        Producto producto4 = new Producto("Nintendo DS", 232, 1);
        productos.addProducto(producto1);
        productos.addProducto(producto2);
        productos.addProducto(producto3);
        productos.addProducto(producto4);
    }
}
