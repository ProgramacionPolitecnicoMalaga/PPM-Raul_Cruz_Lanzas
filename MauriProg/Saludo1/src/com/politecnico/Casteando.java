package com.politecnico;

public class Casteando {
    public static void main(String[] args){
        ComprobarTipo comprobarTipo = new ComprobarTipo();
        int numeroEntero = 5;
        comprobarTipo.mostrarTipo("numeroEntero", numeroEntero);
        comprobarTipo.mostrarTipo("numeroEntero", (long)numeroEntero);

        
    }
}
