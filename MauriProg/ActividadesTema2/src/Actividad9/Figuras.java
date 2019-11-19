package Actividad9;

abstract class Figuras {
    private String color;
    private String nombreTipo;

    public Figuras(String nombreTipo, String color){
        this.nombreTipo = nombreTipo;
        this.color = color;
    }

    public abstract double getArea();

    public String toString(){
        return "La figura " +nombreTipo+
                " es de color " +color+
                " la area es de " + getArea();
    }
}
