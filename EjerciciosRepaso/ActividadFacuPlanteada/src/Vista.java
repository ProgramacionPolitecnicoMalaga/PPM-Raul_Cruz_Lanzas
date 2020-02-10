import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    public final static int CREAR_CATEGORIA = 1;
    public final static int MOSTRAR_CATEGORIA = 2;
    public final static int CREAR_TAREA = 3;
    public final static int CONSULTAR_TAREA = 4;
    public final static int ELIMINAR_TAREA = 5;
    public final static int CONSULTAR_TAREAS_CATEGORIA = 6;
    public final static int CONSULTAR_TAREAS_FECHA = 7;
    public final static int CONSULTAR_TAREAS_DENTRO_PLAZO = 8;
    public final static int CONSULTAR_TAREAS_FUERA_PLAZO = 9;
    public final static int TERMINAR = 10;
    private Scanner lectorTeclado = new Scanner(System.in);

    public Vista(){
        lectorTeclado = new Scanner(System.in).useDelimiter("\n");
    }

    public int mostrarMenu(){
        System.out.println("Opciones: \n" +
                "1. Crear una nueva categoría.\n" +
                "2. Mostrar las categorías existentes.\n" +
                "3. Crear una nueva tarea.\n" +
                "4. Consultar las tareas pendientes.\n" +
                "5. Eliminar una tarea (completada).\n" +
                "6. Consultar las tareas de una categoría.\n" +
                "7. Consultar las tareas en una fecha.\n" +
                "8. Consultar las tareas en tiempo.\n" +
                "9. Consultar las tareas retrasadas. \n" +
                "10. Terminar" +
                "Opcion: ");
        return lectorTeclado.nextInt();
    }


    public String obtenerCategoria() {
        System.out.println("Nombre de la nueva categoria: ");
        return lectorTeclado.next();
    }

    public void mostrarCategorias(ArrayList<Categoria> listaCategorias) {
        System.out.println("Las categorias existentes son: ");
        for(int i=0; i < listaCategorias.size(); i++)
            System.out.println(i + " " + listaCategorias.get(i));
    }

    public String pedirNombreTarea() {
        System.out.println("Nombre de la tarea: ");
        return lectorTeclado.next();
    }

    public LocalDate pedirFechaTarea() {
        System.out.println("Fecha de la tarea (dd/mm/yyyy): ");
        String fechaTxt = lectorTeclado.next();
        DateTimeFormatter formatoTiempo = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate fecha = LocalDate.parse(fechaTxt,formatoTiempo);
        return fecha;
    }

    public int pedirCategoria(ArrayList<Categoria> listaCategorias) {
        System.out.println("Elige una categoria: ");
        mostrarCategorias(listaCategorias);
        System.out.println("Numero de categoria: ");
        return lectorTeclado.nextInt();
    }

    public void mostrarTareas(ArrayList<Tarea> tareasPendientes){
        System.out.println("Las tareas pendientes son: ");
        for(int i=0; i<tareasPendientes.size(); i++)
            System.out.println(i + " " + tareasPendientes.get(i));
    }

    public int pedirPosicionTareaACompletar(ArrayList<Tarea> tareasPendientes) {
        mostrarTareas(tareasPendientes);
        System.out.println("Elige el numemro de tarea a completar: ");
        return lectorTeclado.nextInt();
    }
}
