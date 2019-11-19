public class Personas {
    String nombre;
    String apellidos;

    public Personas(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString(){
        return nombre + " " + apellidos;
    }
}
