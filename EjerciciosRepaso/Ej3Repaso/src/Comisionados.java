public class Comisionados extends Empleados {
    static final int sueldoBase = 550;
    static final int sueldoExtra = 50;
    int numeroVentas;
    int sueldoTotal;

    public Comisionados(String nombre, String apellidos, String DNI, int numeroVentas){
        super(nombre, apellidos, DNI);
        this.numeroVentas = numeroVentas;
        this.sueldoTotal = sueldoBase + (numeroVentas * sueldoExtra);
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(int sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
}
