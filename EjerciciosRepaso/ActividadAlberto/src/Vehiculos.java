public class Vehiculos {
    private String modelo;
    private String marca;
    private String color;
    private int añoFabricacion;
    private String combustion;
    private String estado;
    private double precio;
    private String bastidor;

    public Vehiculos(String modelo, String marca, String color, int añoFabricacion, String combustion, String estado, double precio, String bastidor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        this.combustion = combustion;
        this.estado = estado;
        this.precio = precio;
        this.bastidor = bastidor;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", precio=" + precio + '\'' +
                ", bastidor=" + bastidor +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }
}
