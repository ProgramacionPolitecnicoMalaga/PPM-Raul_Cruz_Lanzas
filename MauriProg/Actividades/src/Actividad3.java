import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        double hipotenusa = 0;
        double cateto1 = 0;
        double cateto2 = 0;
        double area = 0;
        int opcionElegida = 1;
        String unidad = "mm";
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println ("¿Qué unidad desea utilizar? \n"+
        "1. mm \n"+
        "2. cm \n"+
        "3. m \n"+
        "Introduzca una opción: ");

        opcionElegida = lectorTeclado.nextInt();
        System.out.println("opcionElegida = "+opcionElegida);

        if(opcionElegida == 1){
            System.out.println("1. Calcular la hipotenusa de un triángulo a partir de sus catetos.\n" +
                    "2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa\n" +
                    "3. Calcular el área de un triángulo a partir un cateto y la hipotenusa\n" +
                    "4. Caluclar el área de un triángulo a partir de dos catetos\n" +
                    "Elige una opción");

            opcionElegida = lectorTeclado.nextInt();
            System.out.println("opcionElegida = "+opcionElegida);
        }
        if(opcionElegida == 1){
            System.out.println("Introduzca la longitud del cateto 1");
            cateto1 = lectorTeclado.nextDouble();
            System.out.println("Introduzca la longitud del cateto 2");
            cateto2 = lectorTeclado.nextDouble();
            hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
            System.out.println("El valor es: "+ hipotenusa + " " + unidad);
        }
         else if(opcionElegida == 2){
            System.out.println("Introduzco la longitud de la hipotenusa");
            hipotenusa = lectorTeclado.nextDouble();
            hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
            System.out.println("Introduzco la longitud del cateto");
            cateto2 = lectorTeclado.nextDouble();
            cateto1 = Math.sqrt(Math.pow(hipotenusa,2) - Math.pow(cateto2,2));
            System.out.println("El valor es: "+ cateto1 + " " + unidad);
        }
        else if (opcionElegida == 3){
            System.out.println("Introduce la longitud del primer cateto");
            cateto1 = lectorTeclado.nextDouble();
            System.out.println("Introduce la longitud de la hipotenusa");
            hipotenusa = lectorTeclado.nextDouble();
            System.out.println("El área del triángulo es " + (cateto1*hipotenusa)/2 + " " + unidad);
        }
        else if (opcionElegida == 4){
            System.out.println("Introduce la longitud del cateto 1");
            cateto1 = lectorTeclado.nextDouble();
            System.out.println("Introduce la longitud del cateto 2");
            cateto2 = lectorTeclado.nextDouble();
            hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
            System.out.println("El área del triángulo es " + (cateto1*hipotenusa)/2 + " " + unidad);
        }
        else System.out.println("No ha elegido una opción válida");
    }
}
