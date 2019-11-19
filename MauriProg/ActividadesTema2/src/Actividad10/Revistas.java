package Actividad10;

public class Revistas extends Publicaciones {
    private int numeroEjemplares;

    public Revistas(String codigoPublicaciones, String tituloPublicaciones, int añoPublicaciones, boolean prestadoPublicaciones, int numeroEjemplares) {
        super(codigoPublicaciones, tituloPublicaciones, añoPublicaciones, prestadoPublicaciones);
        this.numeroEjemplares = numeroEjemplares;
    }
}
