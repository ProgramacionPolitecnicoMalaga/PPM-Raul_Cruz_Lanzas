package Actividad12;

public class Camiones extends Vehiculos {
    String matricula;
    double ancho;
    double altura;
    double longitud;
    private boolean vendido = false;

    public Camiones(String matricula, String fechaEntrada, String fechaFabricacion, int numeroBastidor, double ancho, double altura, double longitud){
        super(fechaEntrada, fechaFabricacion, numeroBastidor);
        this.matricula = matricula;
        this.ancho = ancho;
        this.altura = altura;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Camiones" +
                "Matricula: " + matricula + "\n" +
                "Fecha de entrada:" + fechaEntrada + "\n"+
                "Fecha de fabricacion: " + fechaFabricacion + "\n"+
                "Numero de bastidor:" + numeroBastidor + "\n"+
                "Ancho: " + ancho + "\n"+
                "Altura: " + altura + "\n"+
                "Longitud: " + longitud + "\n"+
                "--------------";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setVendido(){
        vendido = true;
    }
}
