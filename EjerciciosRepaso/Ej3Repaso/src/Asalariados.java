public class Asalariados extends Empleados{
    static final int sueldoFijo = 1300;

    public Asalariados(String nombre, String apellidos, String DNI){
        super(nombre, apellidos, DNI);
    }

    public static int getSueldoFijo() {
        return sueldoFijo;
    }
}
