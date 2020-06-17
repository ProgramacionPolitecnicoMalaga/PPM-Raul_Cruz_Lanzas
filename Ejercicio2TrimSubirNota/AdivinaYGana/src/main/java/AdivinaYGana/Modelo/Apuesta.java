package AdivinaYGana.Modelo;

public class Apuesta {
    private int id;
    private int id_usuario;
    private int sorteo;
    private int numero;

    public Apuesta(int id, int id_usuario, int sorteo, int numero) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.sorteo = sorteo;
        this.numero = numero;
    }

    public Apuesta(int id_usuario, int sorteo, int numero) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getSorteo() {
        return sorteo;
    }

    public void setSorteo(int sorteo) {
        this.sorteo = sorteo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Apuesta{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", sorteo=" + sorteo +
                ", numero=" + numero +
                '}';
    }
}
