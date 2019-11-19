package Actividad14;

public class NullProductException extends NullPointerException {

    public NullProductException(String mensaje){
        super(mensaje);
        System.out.println(mensaje+"Introduce un producto valido");
    }
}
