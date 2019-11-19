import java.util.Scanner;

public class Saludo {

    public static void main(String[]args){

        int numero;

        Scanner lector = new Scanner(System.in);

        System.out.println("Indica tu nombre");

        String nombre = lector.nextLine();

        System.out.println("Hola" +nombre+"¿Que tal estas hoy?");
    }
}