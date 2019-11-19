package Actividad16;

public class Movimientos {
    int numeroCasilla;
    String tipoDeMovimiento;

    public Movimientos(int numeroCasilla, String tipoDeMovimiento){
        this.numeroCasilla = numeroCasilla;
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public String getTipoDeMovimiento() {
        return tipoDeMovimiento;
    }

    public void setTipoDeMovimiento(String tipoDeMovimiento) {
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    @Override
    public String toString() {
        return (tipoDeMovimiento+ "a la casilla "+ numeroCasilla);
    }
}
