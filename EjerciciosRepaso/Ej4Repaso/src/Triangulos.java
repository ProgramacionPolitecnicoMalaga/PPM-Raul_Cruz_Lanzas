public class Triangulos extends FigurasGeometricas {
    private double base;
    private double altura;

    public Triangulos(String nombreTipo, String color, double base, double altura){
        super(nombreTipo, color);
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return (base * altura) / 2;
    }
}
