package Actividad12;

public class Barcos extends Vehiculos {
    String nombre;
    double eslora;
    int calado;
    double manga;
    private boolean vendido = false;

    public Barcos(String nombre, String fechaFabricacion, String fechaEntrada, int numeroBastidor, double eslora, int calado, double manga){
        super(fechaFabricacion, fechaEntrada, numeroBastidor);
        this.nombre = nombre;
        this.eslora = eslora;
        this.calado = calado;
        this.manga = manga;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){
        return "Barco"+ "\n"+
                "Nombre: "+nombre+"\n"+
                "Fecha de entrada: "+fechaEntrada+"\n"+
                "Fecha de fabricacion: "+fechaFabricacion+"\n"+
                "Numero de bastidor: "+numeroBastidor+"\n"+
                "Eslora: "+eslora+"\n"+
                "Calado: "+calado+"\n"+
                "Manga: "+manga+"\n"+
                "-------------"+"\n";
    }

    public void setVendido(){
        vendido = true;
    }
}
