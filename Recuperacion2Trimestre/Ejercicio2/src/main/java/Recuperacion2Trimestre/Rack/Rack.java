package Recuperacion2Trimestre.Rack;

public class Rack {
    private String etiqueta;
    private String tipo;
    private int id;

    public Rack(String etiqueta, String tipo) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rack{" +
                "etiqueta='" + etiqueta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
