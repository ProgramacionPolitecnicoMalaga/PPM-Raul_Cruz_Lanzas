public abstract class FigurasGeometricas {
    String color;
    String nombreTipo;

    public FigurasGeometricas(String nombreTipo, String color) {
        this.nombreTipo = nombreTipo;
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "color='" + color + '\'' +
                ", nombreTipo='" + nombreTipo + '\'' +
                '}';
    }
}
