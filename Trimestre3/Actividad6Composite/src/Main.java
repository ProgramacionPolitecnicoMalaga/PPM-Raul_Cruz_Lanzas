import Builder.Builder;
import Composite.Paquete;
import Composite.Servicio;

public class Main {
    public static void main(String[] args) {
        Paquete paqueteRaiz = new Paquete("iLink1", Servicio.PRECIO_iLink);
        Builder builder = new Builder(paqueteRaiz);
        builder.iniciarPaquete("iLink1.1", Servicio.PRECIO_iLink)
                .iniciarPaquete("Rack1", Servicio.PRECIO_Rack)
                .añadirProducto("Servidor1", Servicio.PRECIO_Servidor)
                .añadirProducto("Servidor2", Servicio.PRECIO_Servidor)
                .finalizaPaquete()
                .iniciarPaquete("Rack2", Servicio.PRECIO_Rack)
                .añadirProducto("Servidor3", Servicio.PRECIO_Servidor)
                .finalizaPaquete()
                .finalizaPaquete()
                .iniciarPaquete("Cloud1", Servicio.PRECIO_CloudSolutions)
                .añadirProducto("VPS1", Servicio.PRECIO_VPS)
                .iniciarPaquete("Rack3", Servicio.PRECIO_Rack)
                .añadirProducto("VPS2", Servicio.PRECIO_VPS)
                .añadirProducto("VPS3", Servicio.PRECIO_VPS);

        Servicio servicioPrincipal = builder.getResultado();
        System.out.println("Paquete iLink1 construido:");
        System.out.println(servicioPrincipal.toString() + "\n");

        Servicio paqueteRack1 = ((Paquete) servicioPrincipal).getServicioPorNombre("Rack1");
        System.out.println("El precio del paquete Rack1 es de " + paqueteRack1.conseguirPrecio() + "\n");

        Servicio paqueteiLink11 = ((Paquete) servicioPrincipal).getServicioPorNombre("iLink1.1");
        System.out.println("El precio del paquete iLink1.1 es de " + paqueteiLink11.conseguirPrecio() + "\n");

        System.out.println("El precio del paquete iLink1 es de " + servicioPrincipal.conseguirPrecio() + "\n");

        Servicio paqueteCloud1 = ((Paquete) servicioPrincipal).getServicioPorNombre("Cloud1");
        System.out.println("El precio del paquete Cloud1 es de " + paqueteCloud1.conseguirPrecio());
    }

}
