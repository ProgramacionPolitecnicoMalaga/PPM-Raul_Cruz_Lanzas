import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas gestorDeTareas = new GestorDeTareas();

        //Crear una nueva categoría.
        gestorDeTareas.añadirCategoria(new Categoria("Sistemas"));
        gestorDeTareas.añadirCategoria(new Categoria("Programacion"));

        //Mostrar las categorías existentes.
        System.out.println("2- " + gestorDeTareas.listaCategorias() + "\n");

        //Crear una nueva tarea.
        Tarea tarea1 = new Tarea("Terminar ejercicio 1", new Date(120, 1 , 23));
        Tarea tarea2 = new Tarea("Terminar ejercicio 2", new Date(120, 4 , 2));
        Tarea tarea3 = new Tarea("Terminar ejercicio 3", new Date(120, 2 , 13));
        tarea1.setCategoria(new Categoria("Programacion"));
        tarea2.setCategoria(new Categoria("Programacion"));
        gestorDeTareas.añadirTarea(tarea1);
        gestorDeTareas.añadirTarea(tarea2);
        gestorDeTareas.añadirTarea(tarea3);

        //Consultar las tareas pendientes.
        System.out.println("4- " + gestorDeTareas.tareasPendientes() + "\n");

        //Eliminar una tarea (completada).
        tarea1.completarTarea();
        System.out.println("5- " + gestorDeTareas.tareasPendientes() + "\n");

        //Consultar las tareas de una categoría.
        System.out.println("6- " + gestorDeTareas.tareasDeUnaCategoria(new Categoria("Programacion")) + "\n");

        // Consultar las tareas en una fecha.
        System.out.println("7- " + gestorDeTareas.tareasEnUnaFecha(new Date(120, 0, 15)) + "\n  ");

        // Consultar las tareas en tiempo.
        System.out.println("8- " + gestorDeTareas.tareasEnTiempo() + "\n");

        // Consultar las tareas retrasadas.
        System.out.println("9- " + gestorDeTareas.tareasRetrasadas() + "\n");
    }
}
