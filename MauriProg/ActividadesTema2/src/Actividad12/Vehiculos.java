package Actividad12;

public abstract class Vehiculos{
    String fechaFabricacion;
    String fechaEntrada;
    int numeroBastidor;
    private boolean fechaCompra;

    public Vehiculos(String fechaFabricacion, String fechaEntrada, int numeroBastidor){
        this.fechaFabricacion = fechaFabricacion;
        this.fechaEntrada = fechaEntrada;
        this.numeroBastidor = numeroBastidor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public boolean getFechaCompra() {
        return fechaCompra;
    }
}
