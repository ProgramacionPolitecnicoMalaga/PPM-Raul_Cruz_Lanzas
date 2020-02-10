import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Cafeteria {
    private Caja caja;
    private TreeMap<Integer, Mesa> mesas;
    private TreeMap<String, Producto> productos;
    private TreeMap<Integer, Cuenta> cuentas;

    public Cafeteria(){
        caja = new Caja();
        mesas = new TreeMap<>();
        productos = new TreeMap<>();
        cuentas = new TreeMap<>();
    }

    public ArrayList<Mesa> getMesasAbiertas(){
        ArrayList<Mesa> mesasAbiertas = new ArrayList<>();
        for(Map.Entry<Integer, Mesa> entry : mesas.entrySet()){
            if(entry.getValue().isCerrada()){
                mesasAbiertas.add(entry.getValue());
            }
        }
        return getMesasAbiertas();
    }

    public ArrayList<Mesa> getMesasCerradas(){
        ArrayList<Mesa> mesasCerradas = new ArrayList<>();
        for (Map.Entry<Integer, Mesa> entry : mesas.entrySet()){
            if(entry.getValue().isCerrada()){
                mesasCerradas.add(entry.getValue());
            }
        }
        return getMesasCerradas();
    }

    public double getRecuentoCaja(){
        return caja.getRecuentoTotal();
    }

    public void añadirProductoAMesa(int numeroMesa, String nombreProducto){
        Mesa mesa = mesas.get(numeroMesa);
        Producto producto = productos.get(nombreProducto);
        if((mesa != null) && (producto != null)){
            mesa.añadirProductos(producto);
        }
    }

    public double getTotalMesa(int numeroMesa){
        Mesa mesa = mesas.get(numeroMesa);
        return caja.TotalMesa(mesa);
    }

    public Cuenta cerrarMesa(int numeroMesa){
        Mesa mesa = mesas.get(numeroMesa);
        double totalCuenta = caja.cobrarMesa(mesa);
        Cuenta cuenta = new Cuenta(numeroMesa, mesa.getProductos(), totalCuenta);
        cuentas.put(cuenta.getNumeroCuenta(), cuenta);
        mesa.setProductos(new ArrayList<>());
        mesa.setCerrada(true);
        return cuenta;
    }

    public Cuenta getCuenta(int numeroCuenta){
        return cuentas.get(numeroCuenta);
    }
}
