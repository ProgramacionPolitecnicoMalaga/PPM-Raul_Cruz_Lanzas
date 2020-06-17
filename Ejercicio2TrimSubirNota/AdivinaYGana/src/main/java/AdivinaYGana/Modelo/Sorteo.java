package AdivinaYGana.Modelo;

public class Sorteo {
    private int num_sorteo;
    private int apuesta_ganada;
    private double resultado1;
    private int num_id;

    public Sorteo(int num_sorteo, int apuesta_ganada, double resultado, int num_id) {
        this.num_sorteo = num_sorteo;
        this.apuesta_ganada = apuesta_ganada;
        this.resultado1 = resultado;
        this.num_id = num_id;
    }

    public Sorteo(int apuesta_ganada, double resultado1, int num_sorteo) {
    }

    public int getNum_sorteo() {
        return num_sorteo;
    }

    public void setNum_sorteo(int num_sorteo) {
        this.num_sorteo = num_sorteo;
    }

    public int getApuesta_ganada() {
        return apuesta_ganada;
    }

    public void setApuesta_ganada(int apuesta_ganada) {
        this.apuesta_ganada = apuesta_ganada;
    }

    public double getResultado() {
        return resultado1;
    }

    public void setResultado(double resultado) {
        this.resultado1 = resultado;
    }

    public int getNum_id() {
        return num_id;
    }

    public void setNum_id(int num_id) {
        this.num_id = num_id;
    }

    @Override
    public String toString() {
        return "Sorteo{" +
                "num_sorteo=" + num_sorteo +
                ", apuesta_ganada=" + apuesta_ganada +
                ", resultado=" + resultado1+
                ", num_id=" + num_id +
                '}';
    }
}
