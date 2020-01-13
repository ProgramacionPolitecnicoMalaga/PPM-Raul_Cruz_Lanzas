public class Interfaz {
    public Interfaz(){

    }

    public void Menu(){
        System.out.println(
                "1. Empleados que vendieron un número de items" + "\n" +
                        "2. Obtener el promedio de ventas de cada uno" + "\n" +
                        "3. Averiguar quién han conseguido el mayor número de ventas en un día" + "\n" +
                        "4. Insertar un nuevo empleado y sus ventas" + "\n" +
                        "5. Salir"
        );
    }

    public void numeroVentasBuscada(){
        System.out.println("Indique el numero de ventas: ");
    }

    public void comercialesEncontrados(){
        System.out.println("Los comerciales con ventas son: ");
    }

    public void promedio(){
        System.out.println("Los promedios de los empleados son: ");
    }

    public void registroEmpleado(){
        System.out.println("Indique el nombre del empleado: ");
    }

    public void indicarVentas(){
        System.out.println("Indique el numero de ventas: ");
    }

    public void registroCompleto(Comercial comercial){
        System.out.println("Se ha registrado a " +comercial.toString());
    }
}
