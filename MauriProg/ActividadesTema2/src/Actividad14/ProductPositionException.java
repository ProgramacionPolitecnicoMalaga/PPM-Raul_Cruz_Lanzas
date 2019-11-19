package Actividad14;

public class ProductPositionException extends ArrayIndexOutOfBoundsException {

    public ProductPositionException(String mensaje, int numeroPosicion){
        super(mensaje);
        System.out.println(mensaje+"La posicion maxima es "+numeroPosicion);
    }
}
