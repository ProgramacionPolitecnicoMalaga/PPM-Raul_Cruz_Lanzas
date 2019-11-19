package Actividad10;

public class MiMain {
    public static void main(String[] args) {
        Publicaciones[] baseDatosPublicacion = new Publicaciones[10];
        baseDatosPublicacion[0] = new Revistas("1231", "Revista 1", 1930, false, 1);
        baseDatosPublicacion[1] = new Revistas("3434","Revista 2", 1920,true, 2);
        baseDatosPublicacion[2] = new Libros("5676", "Libro 1", 1923, true);
        baseDatosPublicacion[3] = new Libros("6767","Libro 2", 1969, true);

        System.out.println(baseDatosPublicacion[0]);
    }
}
