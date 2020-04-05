package Modelo;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String contraseña;
    private String algoritmo;
    private int numeroIntentos;
    private boolean bloqueado;

    public Usuario(String nombre, String contraseña, String algoritmo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.algoritmo = algoritmo;
        this.numeroIntentos = 0;
        this.bloqueado = false;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                ", numeroIntentos=" + numeroIntentos +
                ", bloqueado=" + bloqueado +
                '}';
    }
}
