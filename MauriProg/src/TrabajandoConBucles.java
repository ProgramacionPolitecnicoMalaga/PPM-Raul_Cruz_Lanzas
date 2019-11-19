import java.util.Scanner;

public class TrabajandoConBucles {
    public static void main(String[] args) {
        int opcion;
        Scanner lectorTeclado = new Scanner(System.in);
        int maximaTemperatura = -100;
        int horaMaximaTemperatura = 0;
        System.out.println("===============");
        System.out.println("Primer for");
        System.out.println("======================");
        do {
            System.out.println("1. Opcion 1\n" +
                    "2. Opcion 2\n" +
                    "3. Salir \n" +
                    "Introduce una opcion: ");
        opcion = lectorTeclado.nextInt();

            if (opcion == 1) {
                System.out.println("Hacer cosas de la opcion 1");
            }
            if (opcion == 2) {
                System.out.println("Hacer cosas de la opcion 2");
            }
            if (opcion == 3) {
                System.out.println("Que tengas un buen dia");
            }
        } while (!(opcion == 3));

        int[] temperaturasDia = {21, 22, 21, 18, 17, 14,
                15, 14, 16, 19, 21, 22,
                23, 26, 29, 29, 27, 28,
                27, 25, 21, 22, 19, 20};


        System.out.println("La maxima temperatura se ha dado a las" + horaMaximaTemperatura + " y ha sido de" + maximaTemperatura+ "ºC");
        System.out.println("================");
        System.out.println("Segundo for");
        System.out.println("================");

        for (int hora = 0; hora < temperaturasDia.length; hora++) {
            if(maximaTemperatura < temperaturasDia[hora])
                maximaTemperatura = temperaturasDia[hora];
        }
        for (int temperatura: temperaturasDia){
            System.out.println("temeperatura = "+ temperatura);
        }
        System.out.println("La temperatura maxima ha sido "+ maximaTemperatura);
    }
}
