package Recuperacion2Trimestre.Servidor;

public class Servidor {
    private int ip;
    private double costeAnual;
    private String idRack;

    public Servidor(int ip, double costeAnual, String idRack) {
        this.ip = ip;
        this.costeAnual = costeAnual;
        this.idRack = idRack;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public double getCosteAnual() {
        return costeAnual;
    }

    public void setCosteAnual(double costeAnual) {
        this.costeAnual = costeAnual;
    }

    public String getIdRack() {
        return idRack;
    }

    public void setIdRack(String idRack) {
        this.idRack = idRack;
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "ip=" + ip +
                ", costeAnual=" + costeAnual +
                ", idRack='" + idRack + '\'' +
                '}';
    }
}
