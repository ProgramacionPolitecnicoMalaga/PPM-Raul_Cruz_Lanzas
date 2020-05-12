package Composite;

public interface Servicio {
    double PRECIO_iLink = 30;
    double PRECIO_Rack = 20;
    double PRECIO_Servidor = 25;
    double PRECIO_CloudSolutions = 15;
    double PRECIO_VPS = 20;
    int Tipo_Paquete = 0;
    int Tipo_Productos = 1;

    void colocarPrecio (double precio);
    double conseguirPrecio();
    int getTipo();
}
