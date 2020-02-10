import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-Introducir nuevo vehiculo: ");
        GestorOperaciones listaVehiculos = new GestorOperaciones();
        Vehiculos nuevoVehiculo1 = new Vehiculos("cupra", "seat", "negro", 2009, "diesel", "Cristal trasero roto", 1500, "2222FCD");
        Vehiculos nuevoVehiculo2 = new Vehiculos("a5", "audi", "blanco", 2019, "diesel", "nuevo", 40000, "1976KKK");
        listaVehiculos.añadirVehiculo(nuevoVehiculo1);
        listaVehiculos.añadirVehiculo(nuevoVehiculo2);
        listaVehiculos.mostrarVehiculo();

        System.out.println("2-Introducir nuevo cliente: ");
        GestorOperaciones listaClientes = new GestorOperaciones();
        Cliente nuevoCliente1 = new Cliente("Raul", "Cruz", "2345234345D", 321541134);
        Cliente nuevoCliente2 = new Cliente("Juan", "Perez", "24525256432F", 455637643);
        listaClientes.añadirCliente(nuevoCliente1);
        listaClientes.añadirCliente(nuevoCliente2);
        listaClientes.mostrarClientes();

        System.out.println("3-Vender un vehiculo a un cliente: ");
        GestorOperaciones listaOperaciones = new GestorOperaciones();
        OperacionesCompraVenta venta1 = new OperacionesCompraVenta("Comprar", 1400, nuevoVehiculo1, nuevoCliente1);
        listaOperaciones.añadirOperacion(venta1);
        Cliente localizarCliente = listaClientes.buscarPorCliente(venta1.getCliente().getNif());
        System.out.println(localizarCliente.toString());
        double precio = listaOperaciones.balanceTotal(venta1.getCliente().getNif());

        System.out.println("4-Comprar un vehiculo a un cliente: ");
        OperacionesCompraVenta compra1 = new OperacionesCompraVenta("Vender", 40000, nuevoVehiculo2, nuevoCliente2);
        listaOperaciones.añadirOperacion(compra1);

    }

}
