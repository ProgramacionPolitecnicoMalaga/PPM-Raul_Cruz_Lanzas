package MODELO;

import java.util.Objects;

public class Mensaje {
    private String titulo;
    private String texto;
    private String emisor;
    private String receptor;
    private String fecha;
    private int id;
    private int idDestinatario;

    public Mensaje(String titulo, String texto, String emisor, String receptor, int idRemitente){}

    public Mensaje(int id, String titulo, String texto, String emisor, String receptor, String fecha){
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", emisor='" + emisor + '\'' +
                ", receptor='" + receptor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", id=" + id +
                ", idDestinatario=" + idDestinatario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return id == mensaje.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
