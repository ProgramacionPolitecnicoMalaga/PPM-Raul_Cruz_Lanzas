package Actividad12;

public class AñadirVehiculosAEspera implements GestionarVehiculo{
    @Override
    public void gestionarVehiculo(Vehiculos vehiculos, Listas listas) {
        if (listas.getVehiculosIntroducidosEspera() < listas.getMaximoVehiculos()) {
            listas.getListaEspera()[listas.getVehiculosIntroducidosEspera()] = vehiculos;
        }
    }
}
