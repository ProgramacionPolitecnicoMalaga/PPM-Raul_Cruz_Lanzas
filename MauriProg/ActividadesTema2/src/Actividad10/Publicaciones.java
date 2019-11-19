package Actividad10;

public abstract class Publicaciones implements Prestable {

    private String codigoPublicaciones;
    private String tituloPublicaciones;
    private int añoPublicaciones;
    boolean prestadoPublicaciones;
    String estado;

    public Publicaciones(String codigoPublicaciones, String tituloPublicaciones, int añoPublicaciones, boolean prestadoPublicaciones){
        this.codigoPublicaciones = codigoPublicaciones;
        this.tituloPublicaciones = tituloPublicaciones;
        this.añoPublicaciones = añoPublicaciones;
        this.prestadoPublicaciones = false;
        estado = "Disponible";
    }

    @Override
    public String toString(){
        return "Codigo: "+ codigoPublicaciones+ "\n"+ "Titulo: " + tituloPublicaciones +"\n" + "Año: " + añoPublicaciones +"\n" + "Estado disponible: " + estado;
    }

    @Override
    public void prestar(){
        prestadoPublicaciones = true;
        estado = "No disponible";
    }

    @Override
    public void devolver(){
        if(prestadoPublicaciones == true){
            prestadoPublicaciones = false;
            estado = "Disponible";
        }
    }

    @Override
    public String estaPrestado(){
        return estado;
    }

    public String getCodigoPublicaciones() {
        return codigoPublicaciones;
    }

    public void setCodigoPublicaciones(String codigoPublicaciones) {
        this.codigoPublicaciones = codigoPublicaciones;
    }

    public String getTituloPublicaciones() {
        return tituloPublicaciones;
    }

    public void setTituloPublicaciones(String tituloPublicaciones) {
        this.tituloPublicaciones = tituloPublicaciones;
    }

    public int getAñoPublicaciones() {
        return añoPublicaciones;
    }

    public void setAñoPublicaciones(int añoPublicaciones) {
        this.añoPublicaciones = añoPublicaciones;
    }
}
