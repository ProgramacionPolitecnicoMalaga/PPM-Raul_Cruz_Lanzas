package Builder;

import Composite.Paquete;
import Composite.Productos;
import Composite.Servicio;

public class Builder {
    private Builder builderPadre;
    private Paquete paquete;

    public Builder(Paquete paquete) {
        builderPadre = null;
        this.paquete = paquete;
    }

    public Builder (Paquete paquete, Builder builderPadre){
        this.paquete = paquete;
        this.builderPadre = builderPadre;
    }

    public Builder iniciarPaquete(String nombreNuevoPaquete, double precioNuevoPaquete){
        Paquete nuevoPaquete = new Paquete(nombreNuevoPaquete, precioNuevoPaquete);
        this.paquete.añadirServicio(nuevoPaquete);
        return new Builder(nuevoPaquete, this);
    }

    public Builder finalizaPaquete(){
        return builderPadre;
    }

    public Builder añadirProducto(String nombre, double precio){
        paquete.añadirServicio(new Productos(nombre, precio));
        return this;
    }

    public Servicio getResultado(){
        return paquete;
    }
}
