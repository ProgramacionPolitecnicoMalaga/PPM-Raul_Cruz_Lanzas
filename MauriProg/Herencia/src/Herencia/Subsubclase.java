package Herencia;

public class Subsubclase extends Subclase {

    public Subsubclase(){
        System.out.println("Constructor subsubclase");
    }

    public Subsubclase(String mensaje, int numero){
        super(mensaje);
        numero++;
        System.out.println(numero);
    }

}
