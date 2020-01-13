public class Interfaz {
    public Interfaz(){

    }

    public void imprimir(){
        System.out.println(
                "¿Que unidad desea utilizar?" + "\n" +
                        "1. mm" + "\n" +
                        "2. cm" + "\n" +
                        "3. m" + "\n" +
                        "Elige una opcion: "
        );
    }

    public void imprimir2(){
        System.out.println(
                "¿Que operacion desea utilizar?" + "\n" +
                        "1. Calcular la hipotenusa de un triangulo a partir de sus catetos." + "\n" +
                        "2. Calcular un cateto de un triangulo a partir de el otro cateto y la hipotenusa" + "\n" +
                        "3. Calcular el area de un triangulo a partir de un cateto y la hipotenusa" + "\n" +
                        "4. Calcular el area de un triangulo a partir de dos catetos" + "\n" +
                        "Elige una opcion: "
        );
    }

    public void opcionNoValida(){
        System.out.println("Opcion no valida");
    }

    public void pedirHipotenusa(){
        System.out.println("Introduzca valor de la hipotenusa: ");
    }

    public void pedirCateto(){
        System.out.println("Introduza valor del cateto: ");
    }

    public void mostrarResultados(double resultado, String unidad){
        Double.toString(resultado);
        System.out.println("El resultado es: "+resultado+ unidad);
    }
}
