import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();
        Comercial comercial1 = new Comercial("Isabel Castillo");
        Comercial comercial2 = new Comercial("Vicente Calzado");
        comercial1.addVentas(7, 7, 10, 6, 4);
        comercial2.addVentas(4, 7, 5, 4, 5);

        interfaz.Menu();
        int opcion = lectorTeclado.nextInt();

        while(opcion != 5) {
            switch (opcion){
                case 1:
                    interfaz.numeroVentasBuscada();
                    int numeroVentas = lectorTeclado.nextInt();
                    interfaz.comercialesEncontrados();
                    if(comercial1.buscarVenta(numeroVentas))
                        System.out.println(comercial1.toString());
                    if(comercial2.buscarVenta(numeroVentas))
                        System.out.println(comercial2.toString());
                    interfaz.Menu();
                    opcion = lectorTeclado.nextInt();
                    break;

                case 2:
                    interfaz.promedio();
                    if(comercial1.calcularPromedioVentas() > comercial2.calcularPromedioVentas())
                        System.out.println(comercial1.toString()+ " "+ comercial1.calcularPromedioVentas()+ " *"+"\n"+
                                            comercial2.toString()+ " "+ comercial2.calcularPromedioVentas());
                    interfaz.Menu();
                    opcion = lectorTeclado.nextInt();
                    break;

                case 3:
                    if(comercial1.buscarVentaMasAlta() > comercial2.buscarVentaMasAlta())
                        System.out.println("La venta mas alta es de "+comercial1.toString()+ "con un total de : "+comercial1.buscarVentaMasAlta()+ " ventas");
                    else System.out.println("La venta mas alta es de "+comercial2.toString()+ "con un total de : "+comercial2.buscarVentaMasAlta()+ " ventas");
                    interfaz.Menu();
                    opcion = lectorTeclado.nextInt();
                    break;

                case 4:
                    interfaz.registroEmpleado();
                    String nombre = lectorTeclado.next();
                    Comercial comercial3 = new Comercial(nombre);
                    interfaz.indicarVentas();
                    int venta1 = lectorTeclado.nextInt();
                    System.out.println("venta 1: ");
                    int venta2 = lectorTeclado.nextInt();
                    System.out.println("venta 2: ");
                    int venta3 = lectorTeclado.nextInt();
                    System.out.println("venta 3: ");
                    int venta4 = lectorTeclado.nextInt();
                    System.out.println("venta 4: ");
                    int venta5 = lectorTeclado.nextInt();
                    System.out.println("venta 5: ");
                    comercial3.addVentas(venta1, venta2, venta3, venta4, venta5);
                    interfaz.registroCompleto(comercial3);
                    interfaz.Menu();
                    opcion = lectorTeclado.nextInt();
                    break;
            }
        }
    }
}
