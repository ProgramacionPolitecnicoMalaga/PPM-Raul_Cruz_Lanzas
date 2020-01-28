import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Tarea {
    private Categoria categoria;
    private String descripcion;
    private Date fechaLimite;
    private boolean terminada;

    public Tarea(String descripcion, Date fechaLimite) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        terminada = false;
        categoria = new Categoria("Todas");
    }

    @Override
    public String toString() {
        return "Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(fechaLimite) + " | " + "Descripcion: "+ descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void completarTarea(){
        terminada = true;
    }
}
