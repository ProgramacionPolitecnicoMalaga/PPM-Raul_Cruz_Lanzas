import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Interfaz interfaz = new Interfaz();
            Formulas formulas = new Formulas();
            Scanner lectorTeclado = new Scanner(System.in);
            String unidadMedida = null;
            double hipotenusa;
            double cateto1;
            double cateto2;

            interfaz.imprimir();
            int opcionElegida = lectorTeclado.nextInt();
            interfaz.imprimir2();
            int opcionElegida2 = lectorTeclado.nextInt();

            if(opcionElegida > 3 || opcionElegida < 1){
                interfaz.opcionNoValida();
            }

            switch (opcionElegida){
                case 1:
                    unidadMedida = "mm";
                    break;
                case 2:
                    unidadMedida = "cm";
                    break;
                case 3:
                    unidadMedida = "m";
                    break;
            }

            switch (opcionElegida2){
                case 1:
                    interfaz.pedirCateto();
                    cateto1 = lectorTeclado.nextDouble();
                    interfaz.pedirCateto();
                    cateto2 = lectorTeclado.nextDouble();
                    interfaz.mostrarResultados(formulas.hipotenusa(cateto1, cateto2), unidadMedida);
                    break;

                case 2:
                    interfaz.pedirCateto();
                    cateto1 = lectorTeclado.nextDouble();
                    interfaz.pedirHipotenusa();
                    hipotenusa = lectorTeclado.nextDouble();
                    interfaz.mostrarResultados(formulas.cateto(cateto1, hipotenusa), unidadMedida);
                    break;

                case 3:
                    interfaz.pedirCateto();
                    cateto1 = lectorTeclado.nextDouble();
                    interfaz.pedirHipotenusa();
                    hipotenusa = lectorTeclado.nextDouble();
                    interfaz.mostrarResultados(formulas.areaCatHip(cateto1, hipotenusa), unidadMedida);
                    break;

                case 4:
                    interfaz.pedirCateto();
                    cateto1 = lectorTeclado.nextDouble();
                    interfaz.pedirCateto();
                    cateto2 = lectorTeclado.nextDouble();
                    interfaz.mostrarResultados(formulas.areaCatetos(cateto1, cateto2), unidadMedida);
                    break;

                default:
                    interfaz.opcionNoValida();
            }
        }
}

