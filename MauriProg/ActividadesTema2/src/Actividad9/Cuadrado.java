package Actividad9;

public class Cuadrado extends Figuras {
    private double lado;
    private  String nombreTipo;

    public Cuadrado(String nombreTipo, String color, double lado){
        super(nombreTipo, color);
        this.lado = lado;
    }

    @Override
    public double getArea(){
        return lado * lado;
    }
}
