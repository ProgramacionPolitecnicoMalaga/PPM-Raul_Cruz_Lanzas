import java.util.Scanner;

public class Interfaz {
    Scanner lectorTeclado = new Scanner(System.in);
    String nombreEmpleado;
    String apellidosEmpleado;
    String DniEmpleado;
    int numeroDeVentas;
    int numeroDeHorasTrabajadas;
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    boolean salir = false;
    Comisionados[] BaseDatosComi = new Comisionados[50];
    PorHoras[] BaseDatosPorHo = new PorHoras[50];
    Asalariados[] BaseDatosAsa = new Asalariados[50];

    public void menuPrincipal(){
        while(!salir){
            System.out.println("Elige que tipo de empleado quieres: \n"+
                    "1-Comisionado \n"+
                    "2-Por horas \n"+
                    "3-Asalariado \n"+
                    "4-Muestra los empleados guardados" +
                    "5-Salir");
            int opcionElegida = lectorTeclado.nextInt();
            switch (opcionElegida){
                case 1:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DniEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el numero de ventas del empleado: ");
                    numeroDeVentas = lectorTeclado.nextInt();
                    BaseDatosComi[n1] = new Comisionados(nombreEmpleado, apellidosEmpleado, DniEmpleado, numeroDeVentas);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + BaseDatosComi[n1].getNombre());
                    System.out.println("Apellido: " + BaseDatosComi[n1].getApellidos());
                    System.out.println("Con DNI: " + BaseDatosComi[n1].getDNI());
                    System.out.println("Ha realizado " + BaseDatosComi[n1].getNumeroVentas() + " ventas");
                    System.out.println("Tiene un salario total de: " + BaseDatosComi[n1].getSalarioTotal());
                    System.out.println("-------------------------------------------------------");
                    n1++;
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DniEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el numero de horas trabajadas del empleado: ");
                    numeroDeHorasTrabajadas = lectorTeclado.nextInt();
                    BaseDatosPorHo[n2] = new PorHoras(nombreEmpleado, apellidosEmpleado, DniEmpleado, numeroDeHorasTrabajadas);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + BaseDatosPorHo[n2].getNombre());
                    System.out.println("Apellido: " + BaseDatosPorHo[n2].getApellidos());
                    System.out.println("Con DNI: " + BaseDatosPorHo[n2].getDNI());
                    System.out.println("Ha trabajado " + BaseDatosPorHo[n2].getNumeroHorasTrabajadas() + " horas");
                    System.out.println("Tiene un sueldo fijo de: " + BaseDatosPorHo[n2].getSalario());
                    System.out.println("-------------------------------------------------------");
                    n2++;
                    break;

                case 3:
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombreEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca los apellidos del empleado: ");
                    apellidosEmpleado = lectorTeclado.next();
                    System.out.println("Introduzca el DNI del empleado: ");
                    DniEmpleado = lectorTeclado.next();
                    BaseDatosAsa[n3] = new Asalariados(nombreEmpleado, apellidosEmpleado, DniEmpleado);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + BaseDatosAsa[n3].getNombre());
                    System.out.println("Apellido: " + BaseDatosAsa[n3].getApellidos());
                    System.out.println("Con DNI: " + BaseDatosAsa[n3].getDNI());
                    System.out.println("Tiene un sueldo fijo de: " + BaseDatosAsa[n3].getSalarioFijo());
                    System.out.println("-------------------------------------------------------");
                    n3++;
                    break;

                case 4:
                    for (int i = 0; i < BaseDatosComi.length; i++){
                        if (BaseDatosComi[i] != null) {
                            System.out.println("-----------------------COMISIONADO----------------------\n" +
                                    "Nombre: " + BaseDatosComi[i].getNombre() + "\n" +
                                    "Apellidos: " + BaseDatosComi[i].getApellidos() + "\n" +
                                    "Con DNI: " + BaseDatosComi[i].getDNI() + "\n" +
                                    "Sueldo total: " + BaseDatosComi[i].getSalarioTotal() +
                                    "\n-------------------------------------------------------\n");
                        }
                    }
                    for (int i = 0; i < BaseDatosPorHo.length; i++){
                        if (BaseDatosPorHo[i] != null) {
                            System.out.println("-----------------------Por Horas-------------\n" +
                                    "Nombre: " + BaseDatosPorHo[i].getNombre() + "\n" +
                                    "Apellidos: " + BaseDatosPorHo[i].getApellidos() + "\n" +
                                    "Con DNI: " + BaseDatosPorHo[i].getDNI() + "\n" +
                                    "Sueldo total: " + BaseDatosPorHo[i].getSalario() +
                                    "\n-------------------------------------------------------\n");
                        }
                    }
                    for (int i = 0; i< BaseDatosAsa.length; i++){
                        if (BaseDatosAsa[i] != null) {
                            System.out.println("-------------------Asalariado----------------\n" +
                                    "Nombre: " + BaseDatosAsa[i].getNombre() + "\n" +
                                    "Apellidos: " + BaseDatosAsa[i].getApellidos() + "\n" +
                                    "Con DNI: " + BaseDatosAsa[i].getDNI() + "\n" +
                                    "Sueldo total: " + BaseDatosAsa[i].getSalarioFijo() +
                                    "\n-------------------------------------------------------\n");
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion valida.");
            }
        }
    }

}
