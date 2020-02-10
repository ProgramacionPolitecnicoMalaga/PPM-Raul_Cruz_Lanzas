import java.util.ArrayList;

public class Cuenta {
    private int numeroCuenta = 0;
    private int numeroMesa;
    private double totalCuenta;
    private ArrayList<Producto> productosConsumidos;
    private double total;

    public Cuenta(int numeroMesa, ArrayList<Producto> productos, double totalCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.numeroMesa = numeroMesa;
        this.totalCuenta = totalCuenta;
        productosConsumidos = new ArrayList<>();
        this.totalCuenta = totalCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", numeroMesa=" + numeroMesa +
                ", totalCuenta=" + totalCuenta +
                ", productosConsumidos=" + productosConsumidos +
                ", total=" + total +
                '}';
    }
}
