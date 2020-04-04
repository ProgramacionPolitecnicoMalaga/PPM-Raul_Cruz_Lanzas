package Modelo;

import java.util.Objects;

public class Credencial {
    String nombre,hash,algoritmo;

    public Credencial() {
    }

    public Credencial(String nombre, String hash, String algoritmo) {
        this.nombre = nombre;
        this.hash = hash;
        this.algoritmo = algoritmo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "nombre='" + nombre + '\'' +
                ", hash='" + hash + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credencial that = (Credencial) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
