public class Main {
    public static void main(String[] args) {
        Tareas tareas = Tareas.getInstance();
        tareas.addTarea("Tarea 1");
        tareas.addTarea("Tarea 2");
        tareas.addTarea("Tarea 3");
        tareas.addTarea("Tarea 4");

        System.out.println(tareas.getUltimaTareaRealizada());

        RetrocesoTarea retrocesoTarea = new RetrocesoTarea();
        retrocesoTarea.retrocederTarea(-2);
        System.out.println(retrocesoTarea.mostrarUltimaTarea());

        AvanceTarea avanceTarea = new AvanceTarea();
        avanceTarea.avanzarTarea(1);
        System.out.println(avanceTarea.mostrarUltimaTarea());
    }
}
