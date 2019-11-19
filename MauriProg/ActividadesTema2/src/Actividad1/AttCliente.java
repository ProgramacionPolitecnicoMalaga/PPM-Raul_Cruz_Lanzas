package Actividad1;

import java.util.Scanner;

public class AttCliente {
    Scanner lectorTeclado;
    public static final int OP_NO_DEFINIDA = 0;
    public static final int OP_PEDIR_LIBROS = 1;
    public static final int OP_MOSTRAR_LIBROS = 2;
    public static final int OP_TERMINAR = 3;

    public AttCliente(){
        lectorTeclado = new Scanner(System.in);
    }

    public int preguntarOpciones(){
        mostrarMenuOpciones();
        return leerRespuestaMenuOpciones();
    }

    public Libro preguntarDatosNuevosLibros(){
        mostrarMenuNuevoLibro();
        return leerNuevoLibro();
    }

    public void mostrarMenuOpciones(){
        System.out.println("Introduzca una opcion: \n"+
                            "1.Introducir un nuevo libro \n"+
                            "2.Mostrar libros existentes \n "+
                            "3.Terminar \n"+
                            "Opcion: ");
    }

    public int leerRespuestaMenuOpciones(){
        return lectorTeclado.nextInt();
    }

    public void mostrarMenuNuevoLibro(){
        System.out.println("Mostrar los nuevos libros: ");
    }

    public Libro leerNuevoLibro(){
        System.out.println("Autor: ");
        String Autor = lectorTeclado.next();
        System.out.println("Titulo: ");
        String Titulo = lectorTeclado.next();
        System.out.println("Editorial: ");
        String Editorial = lectorTeclado.next();
        System.out.println("NumeroDeEdicion: ");
        int NumeroDeEdicion = lectorTeclado.nextInt();
        System.out.println("ISBN: ");
        String ISBN = lectorTeclado.next();
        return new Libro(Autor, Titulo,Editorial,NumeroDeEdicion,ISBN);
    }

    public void mostrarListadoLibros(Biblioteca biblioteca){
        System.out.println("Los libros de la biblioteca son: ");
        System.out.println(biblioteca);
    }
}
