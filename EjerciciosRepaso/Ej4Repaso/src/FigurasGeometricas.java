public abstract class FigurasGeometricas implements Area{
    String color;
    double area;

    public FigurasGeometricas(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void calcularArea() {
    }
}
