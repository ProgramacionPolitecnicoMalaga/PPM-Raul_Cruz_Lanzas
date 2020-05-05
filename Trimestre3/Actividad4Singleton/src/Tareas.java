import java.util.ArrayList;

public class Tareas {
    private static Tareas instance = null;
    private ArrayList<String> tareas;
    private Integer ultimaTareaRealizada = null;

    public Tareas(){
        tareas = new ArrayList<>();
    }

    public static Tareas getInstance(){
        if(instance == null){
            instance = new Tareas();
        }
        return instance;
    }

    public void addTarea(String tarea){
        tareas.add(tarea);
    }

    public String getUltimaTareaRealizada(){
        if(ultimaTareaRealizada == null){
            ultimaTareaRealizada = tareas.size() - 1;
        }
        return tareas.get(ultimaTareaRealizada);
    }

    public void cambiarUltimaTareaRealizada(int numeroDeTarea){
        if(!((numeroDeTarea + ultimaTareaRealizada) > tareas.size()) && numeroDeTarea > 0){
            ultimaTareaRealizada += numeroDeTarea;
        }
        if((tareas.size() - 1) - Math.abs(numeroDeTarea) < tareas.size() && numeroDeTarea < 0){
            ultimaTareaRealizada = ultimaTareaRealizada - (Math.abs(numeroDeTarea));
        }
    }
}
