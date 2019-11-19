package Actividad12;

public class VenderVehiculo implements GestionarVehiculo {
    @Override
    public void gestionarVehiculo(Vehiculos vehiculos, Listas listas) {
        if (listas.getVehiculosVendidos() < listas.getMaximoVehiculos()) {
            listas.getListaVendidos()[listas.getVehiculosVendidos()] = vehiculos;
        }
    }
}
