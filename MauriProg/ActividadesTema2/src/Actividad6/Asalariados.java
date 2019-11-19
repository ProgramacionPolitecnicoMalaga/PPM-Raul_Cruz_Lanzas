public class Asalariados extends Empleados{
    static final int SalarioFijo = 1200;

    public Asalariados(String nombre, String apellidos, String DNI){
        super(nombre, apellidos, DNI);
    }

    public static int getSalarioFijo() {
        return SalarioFijo;
    }
}
