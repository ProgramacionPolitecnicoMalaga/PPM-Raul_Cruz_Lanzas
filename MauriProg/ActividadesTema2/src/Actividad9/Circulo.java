package Actividad9;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(String nombreTipo, String color, double radio){
        super(nombreTipo, color);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio,2);
    }
}
