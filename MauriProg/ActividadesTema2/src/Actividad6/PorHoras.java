import java.util.Scanner;

public class PorHoras extends Empleados {
    static final int precioHoraTrabajada = 10;
    int salario;
    int numeroHorasTrabajadas;

    public PorHoras(String nombre, String apellidos, String DNI, int numeroHorasTrabajadas){
        super(nombre, apellidos, DNI);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.salario = numeroHorasTrabajadas * precioHoraTrabajada;
    }

    public int getNumeroHorasTrabajadas(){
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
