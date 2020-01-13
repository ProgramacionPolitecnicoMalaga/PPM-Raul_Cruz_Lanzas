import java.util.Scanner;

public class Interfaz {
    Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
    String nombreEmpleado;
    String apellidosEmpleado;
    String DNIEmpleado;
    int numeroVentas;
    int numeroHorasTrabajadas;
    int e1 = 0;
    int e2 = 0;
    int e3 = 0;
    boolean salir = false;
    Comisionados[] BaseDatosComisionado = new Comisionados[20];
    PorHoras[] BaseDatosPorHoras = new PorHoras[20];
    Asalariados[] BaseDatosAsalariados = new Asalariados[20];

    public void Menu(){
        while (!salir){
            System.out.println("¿Que tipo de empleado quieres?"+ "\n" +
                               "1.Comisionado" + "\n" +
                               "2.Por horas" + "\n" +
                               "3.Asalariado" + "\n" +
                               "4.Salir"
            );

            int opcionElegida = lectorTeclado.nextInt();
            switch (opcionElegida){
                case 1:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado  =lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DNIEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el numero de ventas: ");
                    numeroVentas = lectorTeclado.nextInt();
                    BaseDatosComisionado[e1] = new Comisionados(nombreEmpleado, apellidosEmpleado, DNIEmpleado, numeroVentas);
                    System.out.println("--------------------");
                    System.out.println("Nombre: "+BaseDatosComisionado[e1].getNombre());
                    System.out.println("Apellidos: "+BaseDatosComisionado[e1].getApellidos());
                    System.out.println("DNI: "+BaseDatosComisionado[e1].getDNI());
                    System.out.println("Numero de ventas: "+BaseDatosComisionado[e1].getNumeroVentas());
                    System.out.println("Salario total: "+BaseDatosComisionado[e1].getSueldoTotal());
                    System.out.println("--------------------");
                    e1++;
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado  =lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DNIEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el numero de horas trabajadas: ");
                    numeroHorasTrabajadas = lectorTeclado.nextInt();
                    BaseDatosPorHoras[e2] = new PorHoras(nombreEmpleado, apellidosEmpleado, DNIEmpleado, numeroHorasTrabajadas);
                    System.out.println("--------------------");
                    System.out.println("Nombre: "+BaseDatosPorHoras[e2].getNombre());
                    System.out.println("Apellidos: "+BaseDatosPorHoras[e2].getApellidos());
                    System.out.println("DNI: "+BaseDatosPorHoras[e2].getDNI());
                    System.out.println("Numero de ventas: "+BaseDatosPorHoras[e2].getNumeroHorasTrabajadas());
                    System.out.println("Salario total: "+BaseDatosPorHoras[e2].getSalario());
                    System.out.println("--------------------");
                    e2++;
                    break;

                case 3:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado  =lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DNIEmpleado = lectorTeclado.next();
                    BaseDatosAsalariados[e3] = new Asalariados(nombreEmpleado, apellidosEmpleado, DNIEmpleado);
                    System.out.println("--------------------");
                    System.out.println("Nombre: "+BaseDatosAsalariados[e3].getNombre());
                    System.out.println("Apellidos: "+BaseDatosAsalariados[e3].getApellidos());
                    System.out.println("DNI: "+BaseDatosAsalariados[e3].getDNI());
                    System.out.println("Sueldo fijo: "+BaseDatosAsalariados[e3].getSueldoFijo());
                    System.out.println("-------------------");
                    e3++;
                    break;

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion valida.");
            }
        }
    }
}
