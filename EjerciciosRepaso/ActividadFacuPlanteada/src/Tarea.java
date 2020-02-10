import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Tarea {
    private Categoria categoria;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean terminada;

    public Tarea(String descripcion, LocalDate fechaLimite, Categoria categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        terminada = false;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(fechaLimite) + " | " + "Descripcion: "+ descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LocalDate getFechaLimite() {
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
