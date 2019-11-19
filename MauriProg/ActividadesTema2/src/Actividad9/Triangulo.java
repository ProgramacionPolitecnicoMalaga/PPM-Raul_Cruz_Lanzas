package Actividad9;

public class Triangulo extends Figuras{
    private double altura;
    private double base;
    private String nombreTipo;

    public Triangulo(String nombreTipo, String color, double altura, double base){
        super(nombreTipo, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura)/2 ;
    }
}
