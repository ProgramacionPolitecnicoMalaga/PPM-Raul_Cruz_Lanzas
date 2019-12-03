public class CategoriaEmpleado {
    private int categoriaEmpleado;
    private double salario;
    private static final int tecnico = 1;
    private static final int administrador = 2;
    private static final int programador = 3;
    private static final int jefeDeProyectos = 4;
    private static final int jefeDeOperaciones = 5;

    public CategoriaEmpleado(int categoriaEmpleado){
        this.categoriaEmpleado = categoriaEmpleado;
        switch (categoriaEmpleado){
            case tecnico:
                salario = 900.0;
                break;
            case administrador:
                salario = 1400.0;
                break;
            case programador:
                salario = 1800.0;
                break;
            case jefeDeProyectos:
                salario = 2500.0;
                break;
            case jefeDeOperaciones:
                salario = 3500.0;
                break;
            default:
                System.out.println("Seleccione una categoria del 1 al 5");
        }
    }

    public String getCategoriaEmpleado(){
        switch (categoriaEmpleado){
            case tecnico:
                return "Tecnico";
            case administrador:
                return "Administrador";
            case programador:
                return "programador";
            case jefeDeProyectos:
                return "jefeDeProyectos";
            case jefeDeOperaciones:
                return "jefeDeOperaciones";
        }
        return null;
    }

    public double getSalario(){
        return salario;
    }
}
