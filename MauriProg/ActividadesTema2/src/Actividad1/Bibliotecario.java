package Actividad1;

import java.util.Scanner;

public class Bibliotecario {
    static AttCliente atencionCliente;
    static Biblioteca biblioteca;

    static void realizarTareaDeBiblioteca(int accion){
        switch (accion){
            case AttCliente.OP_PEDIR_LIBROS:
                Libro nuevoLibro = atencionCliente.preguntarDatosNuevosLibros();
                biblioteca.insertarLibro(nuevoLibro);
                break;
            case AttCliente.OP_MOSTRAR_LIBROS:
                atencionCliente.mostrarListadoLibros(biblioteca);
        }
    }

    public static void main(String[] args) {
        atencionCliente = new AttCliente();
        biblioteca = new Biblioteca(100);
        int accion = AttCliente.OP_NO_DEFINIDA;
        do {
            accion = atencionCliente.preguntarOpciones();
            if (accion != AttCliente.OP_TERMINAR)
                realizarTareaDeBiblioteca(accion);
        }while (accion != AttCliente.OP_TERMINAR) ;
    }
}
