public class Circulos extends FigurasGeometricas {
    private double radio;

    public Circulos(String color, double radio){
        super(color);
        this.radio = radio;
    }

    public void calcularArea(){
        double area = Math.PI * Math.pow(radio,2);
        setArea(area);
    }

    @Override
    public String toString() {
        return "Circulos{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
