package Modelo;

public class Niño {
    private String nombre;
    private String deseo;

    public Niño( String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDeseo(String deseo){
        this.deseo = deseo;
    }

    @Override
    public String toString() {
        return "Niño{" +
                "nombre='" + nombre + '\'' +
                ", deseo='" + deseo + '\'' +
                '}';
    }
}
