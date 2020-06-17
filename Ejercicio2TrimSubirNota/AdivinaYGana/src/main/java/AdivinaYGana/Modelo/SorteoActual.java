package AdivinaYGana.Modelo;

public class SorteoActual {
    private int num_sorteo;

    public SorteoActual(int num_sorteo) {
        this.num_sorteo = num_sorteo;
    }

    public int getNum_sorteo() {
        return num_sorteo;
    }

    public void setNum_sorteo(int num_sorteo) {
        this.num_sorteo = num_sorteo;
    }

    @Override
    public String toString() {
        return "SorteoActual{" +
                "num_sorteo=" + num_sorteo +
                '}';
    }
}
