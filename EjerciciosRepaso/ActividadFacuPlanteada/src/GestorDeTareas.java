import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class GestorDeTareas {
    ArrayList<Tarea> listaTareas;
    ArrayList<Categoria> listaCategorias;

    public GestorDeTareas(){
        listaTareas = new ArrayList<Tarea>();
        listaCategorias = new ArrayList<Categoria>();
    }

    public void añadirTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public ArrayList<Tarea> tareasPendientes(){
        ArrayList<Tarea> pendientes = new ArrayList<>();
        for(Tarea tarea: listaTareas)
            if(!tarea.isTerminada())
                pendientes.add(tarea);
            return pendientes;
    }

    public ArrayList<Tarea> tareasDeUnaCategoria(Categoria categoria){
        ArrayList<Tarea> tareasDeCategoria = new ArrayList<>();
        for(Tarea tarea: listaTareas)
            if(tarea.getCategoria().equals(categoria))
                tareasDeCategoria.add(tarea);
            return tareasDeCategoria;
    }

    public ArrayList<Tarea> tareasEnUnaFecha(Date fecha){
        ArrayList<Tarea> fechaBuscada = new ArrayList<>();
        for(Tarea tarea: listaTareas)
            if(tarea.getFechaLimite().compareTo(fecha) == 0)
                fechaBuscada.add(tarea);
            return fechaBuscada;
    }

    public ArrayList<Tarea> tareasEnTiempo(){
        Date fechaActual = new Date();
        ArrayList<Tarea> fechaTiempo = new ArrayList<>();
        for(Tarea tarea: listaTareas)
            if(tarea.getFechaLimite().compareTo(fechaActual) > -1)
                fechaTiempo.add(tarea);
            return fechaTiempo;
    }

    public ArrayList<Tarea> tareasRetrasadas(){
        Date fechaActual = new Date();
        ArrayList<Tarea> fechaRetrasada = new ArrayList<>();
        for(Tarea tarea: listaTareas)
            if(tarea.getFechaLimite().compareTo(fechaActual) < 0)
                fechaRetrasada.add(tarea);
            return fechaRetrasada;
    }

    public ArrayList<Categoria> listaCategorias(){
        for(Tarea tarea: listaTareas)
            listaCategorias.add(tarea.getCategoria());
        Set<Categoria> hs = new HashSet<>(listaCategorias);
        listaCategorias.clear();
        listaCategorias.addAll(hs);
        return listaCategorias;
    }

    public ArrayList<Categoria> añadirCategoria(Categoria categoria){
        listaCategorias.add(categoria);
        return listaCategorias;
    }
}
