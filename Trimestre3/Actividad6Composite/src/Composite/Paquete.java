package Composite;

import java.util.ArrayList;

public class Paquete implements Servicio{
    private String nombre;
    private double precioTasa;
    private ArrayList<Servicio> listaServicios;

    public Paquete(String nombre, double precioTasa) {
        this.nombre = nombre;
        this.precioTasa = precioTasa;
        listaServicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioTasa() {
        return precioTasa;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void añadirServicio(Servicio servicio){
        listaServicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio){
        listaServicios.remove(servicio);
    }

    @Override
    public void colocarPrecio(double precio) {
        precioTasa = precio;
    }

    @Override
    public double conseguirPrecio() {
        double total = precioTasa;
        for(Servicio servicio: listaServicios){
            total += servicio.conseguirPrecio();
        }
        return total;
    }

    @Override
    public int getTipo() {
        return 0;
    }

    public Servicio getServicioPorNombre(String nombre) {
        if (this.nombre.equals(nombre)) {
            return this;
        }
        for (Servicio servicio : listaServicios) {
            if (servicio.getTipo() == Servicio.Tipo_Paquete){
                Servicio paquete = ((Paquete) servicio).getServicioPorNombre(nombre);
                if (paquete!=null && ((Paquete) paquete).getNombre().equals(nombre))
                    return paquete;
            } else if (((Productos) servicio).getNombre().equals(nombre))
                return servicio;
        }
        return null;
    }

    @Override
    public String toString() {
        String resultado = nombre + "[";
        for(int i=0; i<listaServicios.size() -1 ; i++){
            resultado += listaServicios.get(i).toString() + ",";
        }
        if(listaServicios.size() > 0){
            resultado += listaServicios.get(listaServicios.size() - 1);
        }
        resultado += "]";
        return resultado;
    }
}
