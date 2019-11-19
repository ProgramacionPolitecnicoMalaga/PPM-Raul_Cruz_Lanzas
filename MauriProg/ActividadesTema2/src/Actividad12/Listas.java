package Actividad12;

public class Listas {
    private Vehiculos[] listaEspera = new Vehiculos[maximoVehiculos];
    private Vehiculos[] listaSubasta = new Vehiculos[maximoVehiculos];
    private Vehiculos[] listaVendidos = new Vehiculos[maximoVehiculos];
    private Vehiculos[] listaCompradores = new Vehiculos[maximoVehiculos];
    private int vehiculosIntroducidosEspera = 0;
    private int vehiculosIntroducidosSubasta = 0;
    private int vehiculosVendidos = 0;
    private static final int maximoVehiculos = 50;
    private GestionarVehiculo gestorVehiculos;
    private boolean coincidencia = false;

    public Listas(){

    }

    public int getMaximoVehiculos(){
        return maximoVehiculos;
    }

    public Vehiculos[] getListaEspera(){
        return listaEspera;
    }

    public int getVehiculosIntroducidosEspera(){
        return vehiculosIntroducidosEspera;
    }

    public Vehiculos[] getListaSubasta(){
        return listaSubasta;
    }

    public int getVehiculosIntroducidosSubasta() {
        return vehiculosIntroducidosSubasta;
    }

    public Vehiculos[] getListaVendidos(){
        return listaVendidos;
    }

    public int getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void obtenerListaEspera(){
        for(int i=0; i < vehiculosIntroducidosEspera; i++){
            System.out.println(listaEspera[i]);
        }
    }

    public void obtenerListaSubasta(){
        for(int i=0; i < vehiculosIntroducidosSubasta; i++){
            System.out.println(listaSubasta[i]);
        }
    }

    public void obtenerListaVendidos(){
        for(int i=0; i < vehiculosVendidos; i++){
            System.out.println("Vehiculo vendido: ");
            System.out.println(listaVendidos[i]);
            System.out.println("Comprado por: ");
            System.out.println(listaCompradores);
            System.out.println("Precio venta: ");
            System.out.println(listaCompradores[i].getFechaCompra());
            System.out.println("Fecha venta: ");
            System.out.println(listaCompradores[i].getFechaCompra());
            System.out.println("----------------------------------");
        }
    }

    public void obtenerListadoCompletoVehiculos(){
        if(vehiculosIntroducidosEspera > 0){
            System.out.println("Listado de vehiculos en espera: ");
            obtenerListaEspera();
        }

        if (vehiculosIntroducidosSubasta > 0){
            System.out.println("Listado de vehiculos en subasta: ");
            obtenerListaSubasta();
        }

        if(vehiculosVendidos > 0){
            System.out.println("Listado de vehiculos vendidos: ");
            for(int i=0; i < vehiculosVendidos; i++){
                System.out.println(listaVendidos[i]);
            }
        }
    }

    public void añadirVehiculoEspera(Vehiculos vehiculos){
        gestorVehiculos = new AñadirVehiculosAEspera();
        gestorVehiculos.gestionarVehiculo(vehiculos, this);
        vehiculosIntroducidosEspera++;
    }
    public void añadirVehiculoSubasta(Vehiculos vehiculos){
        gestorVehiculos = new AñadirVehiculosASubasta();
        gestorVehiculos.gestionarVehiculo(vehiculos, this);
        vehiculosIntroducidosSubasta++;
        borrarVehiculoEnEspera(vehiculos);
    }

    public void venderVehiculo(Vehiculos vehiculos, Compradores compradores, double precio, String fecha){
        gestorVehiculos = new VenderVehiculo();
        gestorVehiculos.gestionarVehiculo(vehiculos, this);

        if (vehiculosVendidos < maximoVehiculos) {
            listaCompradores[vehiculosVendidos] = vehiculos;
        }
        compradores.setPrecioCompra(precio);
        compradores.setFechaCompra(fecha);
        vehiculosVendidos++;
        borrarVehiculoEnSubasta(vehiculos);
    }

    public void borrarVehiculoEnEspera(Vehiculos vehiculos){
        for(int i=0; i < vehiculosIntroducidosEspera; i++){
            if(coincidencia){
                listaEspera[i] = listaEspera[i+1];
            }
            if(vehiculos.getNumeroBastidor() == (listaEspera[i].getNumeroBastidor())){
                listaEspera[i] = listaEspera[i+1];
                coincidencia = true;
                vehiculosIntroducidosEspera--;
            }
        }
        coincidencia = false;
    }

    public void borrarVehiculoEnSubasta(Vehiculos vehiculos){
        for(int i=0; i < vehiculosIntroducidosSubasta; i++){
            if(coincidencia){
                listaSubasta[i] = listaSubasta[i+1];
            }
            if(vehiculos.getNumeroBastidor() == (listaSubasta[i].getNumeroBastidor())){
                listaSubasta[i] = listaSubasta[i+1];
                coincidencia = true;
                vehiculosIntroducidosSubasta--;
            }
        }
        coincidencia = false;
    }
}
