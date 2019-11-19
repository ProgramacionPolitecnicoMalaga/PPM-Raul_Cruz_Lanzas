package Actividad14;

public class MiMain {
    public static void main(String[] args) {

        LoteProductos herramientas = new LoteProductos();
        Productos prod1 = new Productos("martillo", 10, 5);
        Productos prod2 = new Productos("Destorinillador", 7,4);
        Productos prod3 = new Productos("Clavos", 3,2);
        Productos prod4 = new Productos("Radial", 70, 1);
        Productos prod5 = new Productos("Cierra", 34,3);

        herramientas.addProducto(prod1);
        herramientas.addProducto(prod2);
        herramientas.addProducto(prod3);
        herramientas.addProducto(prod4);
        herramientas.addProducto(prod5);
        herramientas.masBarato();
        herramientas.mejorValorado(herramientas);
        herramientas.valoracionPrecio(herramientas);

        prod1 = null;

        try {
            herramientas.addProducto(prod1);
        } catch (NullProductException ignored) {
        }
        herramientas.getProductoEnPosicion(50);
    }
}
