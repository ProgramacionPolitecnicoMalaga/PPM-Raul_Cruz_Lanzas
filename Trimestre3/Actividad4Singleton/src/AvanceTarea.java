public class AvanceTarea {
    private Tareas tareas = Tareas.getInstance();

    public void avanzarTarea(int numeroDeTareas){
        if(numeroDeTareas > 0){
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        } else{
            System.out.println("Introduce un numero positivo: ");
        }
    }

    public String mostrarUltimaTarea(){
        return tareas.getUltimaTareaRealizada();
    }
}
