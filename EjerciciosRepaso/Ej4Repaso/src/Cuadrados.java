public class Cuadrados extends FigurasGeometricas{
    private double lado;

    public Cuadrados(String nombreTipo, String color, double lado){
        super(nombreTipo, color);
        this.lado = lado;
    }

    public double getArea(){
        return lado * lado;
    }
}
