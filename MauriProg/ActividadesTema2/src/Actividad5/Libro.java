package Actividad5;

import java.util.Scanner;

public class Libro {

    Scanner lectorTeclado = new Scanner(System.in);

    String NombreAutor;
    String TituloLibro;
    int FechaFinalizacion;

    public Libro(String nombreAutor, String tituloLibro, int fechaFinalizacion) {
        NombreAutor = nombreAutor;
        TituloLibro = tituloLibro;
        FechaFinalizacion = fechaFinalizacion;

        System.out.println("Nombre del autor: ");
        String NombreAutor = lectorTeclado.next();
        System.out.println("Titulo del libro: ");
        String TituloLibro = lectorTeclado.next();
        System.out.println("Fecha de finalizacion: ");
        String FechaFinalizacion = lectorTeclado.next();
    }

    public Libro(Scanner lectorTeclado, String nombreAutor, String tituloLibro, int fechaFinalizacion) {
        this.lectorTeclado = lectorTeclado;
        NombreAutor = nombreAutor;
        TituloLibro = tituloLibro;
        FechaFinalizacion = fechaFinalizacion;
    }

    public void Publicacion(){
        String NombreEditorial;
        String ISBN;
        String NumeroEdicion;
        String DescripcionUbicacion;

        System.out.println("Nombre del editorial: ");
        NombreEditorial = lectorTeclado.next();
        System.out.println("ISBN: ");
        ISBN = lectorTeclado.next();
        System.out.println("Numero de edicion: ");
        NumeroEdicion = lectorTeclado.next();
        System.out.println("Descripcion de la ubicacion: ");
        DescripcionUbicacion = lectorTeclado.next();

    }
}
