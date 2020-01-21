public class Triangulos extends FigurasGeometricas {
    private double base;
    private double altura;

    public Triangulos(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        double area = (base * altura) / 2;
        setArea(area);
    }

    @Override
    public String toString() {
        return "Triangulos{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
