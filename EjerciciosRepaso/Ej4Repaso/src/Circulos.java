public class Circulos extends FigurasGeometricas {
    private double radio;

    public Circulos(String nombreTipo, String color, double radio){
        super(nombreTipo, color);
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * Math.pow(radio,2);
    }
}
