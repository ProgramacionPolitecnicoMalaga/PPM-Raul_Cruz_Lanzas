import java.sql.SQLOutput;
import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        double ladoDelCuadrado = 0;
        int opcionElegida = 1;
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Elige una opcion\n" +
        "1.Introducir un nuevo lado del cuadrado\n" +
        "2.Calcular el perimetro del cuadrado actual\n" +
        "3.Calcular el area del cuadrado\n" +
        "4.Finalizar el programa\n"+
        "Indica la opcion[1]: \n");

        if(lectorTeclado.hasNextInt()) {
            opcionElegida = lectorTeclado.nextInt();
        } else {
            opcionElegida = 0;
            lectorTeclado.next();
        }

        while (opcionElegida != 4) {
            if (opcionElegida == 1) {
                System.out.println("Introduzca el valor del lado: ");
                ladoDelCuadrado = lectorTeclado.nextDouble();
                System.out.println("El lado del cuadrado actual es " + ladoDelCuadrado + "\n\n");
            } else if (opcionElegida == 2) {
                System.out.println("El perimetro del cuadrado actual es " + 4 * ladoDelCuadrado + "\n\n");
            } else if (opcionElegida == 3) {
                System.out.println("El area del cuadrado es " + ladoDelCuadrado * ladoDelCuadrado + "\n\n");
            } else if (opcionElegida == 4){
                System.out.println("Que tengas un buen dia" + "\n\n");
            } else {
                System.out.println("No entiendo esa opcion" + "\n\n");
            }
        }
        /*if(opcionElegida == 1){
            System.out.println("Introduzca el valor del lado: ");
            ladoDelCuadrado = lectorTeclado.nextDouble();
            System.out.println("El lado del cuadrado actual es "+ ladoDelCuadrado);
        }
        
        else if(opcionElegida == 2) {
            System.out.println("El perimetro del cuadrado actual es " + 4*ladoDelCuadrado);
        }    
        
        else if(opcionElegida == 3){
            System.out.println("El area del cuadrado es "+ ladoDelCuadrado*ladoDelCuadrado);
        }
        
        else{
            System.out.println("No entiendo esa opcion");
        }*/
    }
}
