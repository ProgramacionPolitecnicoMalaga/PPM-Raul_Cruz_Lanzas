public class RetrocesoTarea {
    private Tareas tareas = Tareas.getInstance();

    public void retrocederTarea(int numeroDeTareas){
        if(numeroDeTareas <= 0){
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        }else{
            System.out.println("Introduce un numero negativo: ");
        }
    }

    public String mostrarUltimaTarea(){
        return tareas.getUltimaTareaRealizada();
    }
}
