import java.util.ArrayList;
import java.util.Iterator;

public class Caja {
    private double recuentoTotal;

    public Caja() {
    }

    public double cobrarMesa(Mesa mesa){
        double precioTotal = TotalMesa(mesa);
        recuentoTotal += precioTotal;
        return precioTotal;
    }

    public double TotalMesa(Mesa mesa){
        double total = 0;
        Iterator<Producto> it = mesa.getProductos().iterator();
        while (it.hasNext()){
            total += it.next().getPrecio();
        }
        return total;
    }

    public double getRecuentoTotal(){
        return recuentoTotal;
    }
}
