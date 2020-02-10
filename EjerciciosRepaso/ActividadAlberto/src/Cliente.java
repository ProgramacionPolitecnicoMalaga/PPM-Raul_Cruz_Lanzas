public class Cliente {
    private String nombre;
    private String apellidos;
    private String nif;
    private int cuentaBancaria;

    public Cliente(String nombre, String apellidos, String nif, int cuentaBancaria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", cuentaBancaria=" + cuentaBancaria +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
