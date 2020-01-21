public class Cuadrados extends FigurasGeometricas{
    private double lado;

    public Cuadrados(String color, double lado){
        super(color);
        this.lado = lado;
    }

    public void calcularArea(){
        double area = lado * lado;
        setArea(area);
    }

    @Override
    public String toString() {
        return "Cuadrados{" +
                "lado=" + lado +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
