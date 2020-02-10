import java.util.ArrayList;
import java.util.Iterator;

public class GestorOperaciones {
    ArrayList<Vehiculos> listaVehiculos;
    ArrayList<Cliente> listaClientes;
    ArrayList<OperacionesCompraVenta> listaOperaciones;

    public GestorOperaciones(){
        listaVehiculos = new ArrayList<Vehiculos>();
        listaClientes = new ArrayList<Cliente>();
        listaOperaciones = new ArrayList<OperacionesCompraVenta>();
    }

    public void añadirVehiculo(Vehiculos vehiculos){
        listaVehiculos.add(vehiculos);
    }

    public void mostrarVehiculo(){
        listaVehiculos.forEach(Vehiculos -> System.out.println(Vehiculos + "\n"));
    }

    public void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void mostrarClientes(){
        listaClientes.forEach(Cliente -> System.out.println(Cliente + "\n"));
    }

    public void añadirOperacion(OperacionesCompraVenta operacion){
        listaOperaciones.add(operacion);
    }

    public void mostrarOperaciones(){
        listaOperaciones.forEach(OperacionesCompraVenta -> System.out.println(OperacionesCompraVenta + "\n"));
    }

    public void operacionCompra(Cliente cliente, Vehiculos vehiculos, double precioAcordado){
        Vehiculos vehiculos1 = new Vehiculos("leon", "seat", "rojo", 2009, "diesel", "nuevo", 3400, "1587KAS");
        Cliente cliente1 = new Cliente("Raul", "Cruz", "23412345E", 14365243);
        OperacionesCompraVenta operacionCompra = new OperacionesCompraVenta("Compra", 4500, vehiculos1, cliente1);
        listaOperaciones.add(operacionCompra);
    }

    public void operacionVenta(Cliente cliente, Vehiculos vehiculos, double precionAcordado, String tipoOperacion){
        Vehiculos vehiculos2 = new Vehiculos("Cupra", "seat", "Blanco", 2009, "gasoil", "segunda mano", 7000, "2333FCZ");
        Cliente cliente2 = new Cliente("Juan", "Cruz", "432542353D", 121443);
        OperacionesCompraVenta operacionVenta = new OperacionesCompraVenta("venta", 6700, vehiculos2, cliente2);
        listaOperaciones.add(operacionVenta);
    }

    public double balanceTotal(String nif){
        double balanceTotal = 0;
        for(int i=0; i < listaOperaciones.size(); i++){
            if(listaOperaciones.get(i).getCliente().getNif().equalsIgnoreCase(nif)){
                balanceTotal = elegirSigno(listaOperaciones.get(i));
                balanceTotal += listaOperaciones.get(i).getPrecioAcordado();
                System.out.println(balanceTotal);
            }
        }
        return balanceTotal;
    }

    private double elegirSigno(OperacionesCompraVenta contrato) {
        double contratoTotal = 0;
        if(contrato.getTipoOperacion().equalsIgnoreCase("Compra")){
            contratoTotal =- (contrato.getPrecioAcordado());
        }
        else if(contrato.getTipoOperacion().equalsIgnoreCase("Venta")){
            contratoTotal = contrato.getPrecioAcordado();
        }
        return contratoTotal;
    }

    public Cliente buscarPorCliente(String nif){
        Cliente cliente = null;
        Iterator<Cliente> it = listaClientes.iterator();
        while (it.hasNext()){
            Cliente clienteTemporal = it.next();
            if(clienteTemporal.getNif().equals(nif)){
                cliente = clienteTemporal;
            }
        }
        return cliente;
    }

    public Vehiculos buscarPorVehiculo(String numeroBastidor){
        Vehiculos vehiculos = null;
        Iterator<Vehiculos> it = listaVehiculos.iterator();
        while (it.hasNext()){
            Vehiculos vehiculosTemporal = it.next();
            if(vehiculosTemporal.getBastidor().equals(numeroBastidor)){
                vehiculos = vehiculosTemporal;
            }
        }
        return vehiculos;
    }
}
