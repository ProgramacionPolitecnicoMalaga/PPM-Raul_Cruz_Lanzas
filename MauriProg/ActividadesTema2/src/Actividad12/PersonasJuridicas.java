package Actividad12;

public class PersonasJuridicas extends Compradores {
    private static final double precioCompra = 0;
    String CIF;
    String razonSocial;

    public PersonasJuridicas(String nombre, String CIF, String razonSocial){
        super(nombre, precioCompra, nombre);
        this.CIF = CIF;
        this.razonSocial = razonSocial;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
