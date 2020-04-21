package Personas;

public class Poblacion {
    private int año;
    private String nacionalidad;
    private int numeroDeEmpadronados;

    public Poblacion(int año, String nacionalidad, int numeroDeEmpadronados) {
        this.año = año;
        this.nacionalidad = nacionalidad;
        this.numeroDeEmpadronados = numeroDeEmpadronados;
    }

    public int getAño() {
        return año;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getNumeroDeEmpadronados() {
        return numeroDeEmpadronados;
    }
}
