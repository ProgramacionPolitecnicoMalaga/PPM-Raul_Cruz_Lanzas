package MODELO;

import java.util.Objects;

public class Credencial {
    private int id;
    private String nombre;
    private String clave;
    private String algoritmo;

    public Credencial(){}

    public Credencial(String nombre, String clave, String algoritmo) {
        this.nombre = nombre;
        this.clave = clave;
        this.algoritmo = algoritmo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave(String clave) {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getAlgoritmo(String algoritmo) {
        return this.algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credencial that = (Credencial) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getClave() {
        return this.clave;
    }

    public String getAlgoritmo() {
        return this.algoritmo;
    }
}
