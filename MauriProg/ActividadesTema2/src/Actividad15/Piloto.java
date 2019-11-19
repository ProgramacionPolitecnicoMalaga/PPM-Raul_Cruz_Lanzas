package Actividad15;

public class Piloto extends  ComparadorPilotos implements Comparable<Piloto>{
    String nombre;
    String escuderia;
    int posicionDeSalida;
    boolean descalificado = false;

    public Piloto(String nombre, String escuderia, int posicionDeSalida){
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionDeSalida = posicionDeSalida;
        this.descalificado = descalificado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public int getPosicionDeSalida() {
        return posicionDeSalida;
    }

    public boolean getDescalificado() {
        return descalificado;
    }

    public void setDescalificado() {
        descalificado = true;
    }

    @Override
    public int compareTo(Piloto o){
        if(o.getPosicionDeSalida() > posicionDeSalida){
            return -1;
        }else if(getPosicionDeSalida() > posicionDeSalida){
            return  0;
        }else{
            return 1;
        }
    }

    public String toString(){
        return "Piloto"+ "\n"+
                "Nombre: "+ nombre + "\n"+
                "Escuderia: "+ escuderia + "\n"+
                "Posición de salida: "+ posicionDeSalida + "\n"+
                "Descalificado: "+ descalificado + "\n"+
                "--------------";
    }
}
