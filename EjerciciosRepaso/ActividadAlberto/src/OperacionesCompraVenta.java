public class OperacionesCompraVenta {
    private String tipoOperacion;
    private double precioAcordado;
    private Vehiculos vehiculos;
    private Cliente cliente;

    public OperacionesCompraVenta(String tipoOperacion, double precioAcordado, Vehiculos vehiculos, Cliente cliente) {
        this.tipoOperacion = tipoOperacion;
        this.precioAcordado = precioAcordado;
        this.vehiculos = vehiculos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "OperacionesCompraVenta{" +
                "tipoOperacion='" + tipoOperacion + '\'' +
                ", precioAcordado=" + precioAcordado +
                ", vehiculos=" + vehiculos +
                ", cliente=" + cliente +
                '}';
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(double precioAcordado) {
        this.precioAcordado = precioAcordado;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
