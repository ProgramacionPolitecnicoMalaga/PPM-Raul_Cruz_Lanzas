package Actividad12;

public class AñadirVehiculosASubasta implements GestionarVehiculo{
    @Override
    public void gestionarVehiculo(Vehiculos vehiculos, Listas listas){
        if(listas.getVehiculosIntroducidosSubasta() < listas.getMaximoVehiculos()){
            listas.getListaSubasta()[listas.getVehiculosIntroducidosSubasta()] = vehiculos;
        }
    }
}


