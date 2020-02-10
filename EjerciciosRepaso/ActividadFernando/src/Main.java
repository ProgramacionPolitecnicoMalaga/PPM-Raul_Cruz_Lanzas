import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Cafeteria cafeteria;
    private static Producto producto;
    private static Mesa mesa;
    private static Caja caja;

    public static void main(String[] args) {
        cafeteria = new Cafeteria();

        //Consultar mesas abiertas
        ArrayList<Mesa> mesasAbiertas = cafeteria.getMesasAbiertas();
        System.out.println(mesasAbiertas);

        //Consultar mesas cerradas
        ArrayList<Mesa> mesasCerradas = cafeteria.getMesasCerradas();
        System.out.println(mesasCerradas);

        //Consultar el recuento de la caja actual
        caja.getRecuentoTotal();

        //Añadir productos a la lista de productos
        producto.añadirProductos("Vino", 4.23);
        producto.añadirProductos("Canelones", 7.56);

        //Añadir producto a una mesa
        cafeteria.añadirProductoAMesa(1, "Mollete");
        cafeteria.añadirProductoAMesa(2, "Coca cola");
        cafeteria.añadirProductoAMesa(3, "Cafe");

        //Cerrar mesa
        cafeteria.cerrarMesa(2);
    }

}
