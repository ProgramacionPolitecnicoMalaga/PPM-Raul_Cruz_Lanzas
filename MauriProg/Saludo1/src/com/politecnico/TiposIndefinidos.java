package com.politecnico;

public class TiposIndefinidos {
    public static void main(String[] args){
        ComprobarTipo comprobarTipo = new ComprobarTipo();
        int edad;
        double distancia;
        boolean condicion;
        var tiempo = 10.1;

        System.out.println(tiempo);
        comprobarTipo.mostrarTipo("tiempo",tiempo);

    }
}
