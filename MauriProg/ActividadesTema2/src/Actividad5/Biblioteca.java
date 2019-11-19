package Actividad5;

import Actividad1.Libro;

import java.util.Scanner;

public class Biblioteca {

    Scanner lectorTeclado = new Scanner(System.in);

    public int preguntarOpciones(){
        mostrarMenuOpciones();
        return leerRespuestaMenuOpciones();
    }

    public void mostrarMenuOpciones(){
        System.out.println("Introduzca una opcion: \n"+
                "1.Insertar un nuevo libro \n"+
                "2.Mostrar un listado de libros disponibles, mostrando el código del ejemplar, título y la edición \n "+
                "3.Consultar los datos de un libro \n"+
                "4.Eliminar un libro \n"+
                "5.Finalizar programa");
    }

    public int leerRespuestaMenuOpciones(){
        return lectorTeclado.nextInt();
    }

}
