import java.util.Scanner;

public class Comisionados extends Empleados {
    static final int sueldoBase = 500;
    static final int sueldoExtra = 50;
    int numeroVentas;
    int SalarioTotal;

    public Comisionados(String nombre, String apellidos, String DNI, int numeroVentas){
        super(nombre, apellidos, DNI);
        this.numeroVentas = numeroVentas;
        this.SalarioTotal = sueldoBase+(numeroVentas*sueldoExtra);
    }

    public int getNumeroVentas(){
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getSalarioTotal(){
        return SalarioTotal;
    }

    public void setSalarioTotal(int salarioTotal) {
        SalarioTotal = salarioTotal;
    }
}
