package Actividad1;

public class Libro {
        String Titulo;
        String Autor;
        String Editorial;
        int NumeroDeEdicion;
        String ISBN;

    public Libro(String titulo, String autor) {
        Titulo = titulo;
        Autor = autor;
    }

    public Libro(String titulo, String autor, String editorial, int numeroDeEdicion, String ISBN) {
        Titulo = titulo;
        Autor = autor;
        Editorial = editorial;
        NumeroDeEdicion = numeroDeEdicion;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getNumeroDeEdicion() {
        return NumeroDeEdicion;
    }

    public void setNumeroDeEdicion(int numeroDeEdicion) {
        NumeroDeEdicion = numeroDeEdicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
