public class PorHoras extends Empleados{
    static final int precioHora = 8;
    int numeroHorasTrabajadas;
    int salario;

    public PorHoras(String nombre, String apellidos, String DNI, int numeroHorasTrabajadas){
        super(nombre, apellidos, DNI);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.salario = numeroHorasTrabajadas * precioHora;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
