package Actividad14;

public class LoteProductos implements SelectorDeMejoresProducto{
    Productos[] herramientas;
    double mejorValorado;
    double masBarato;
    int n=0;

    public LoteProductos(){
        herramientas = new Productos[5];
    }

    public int getTotalProductos(){
        int contadorLote = 0;
        for(int i=0; i < herramientas.length; i++){
            if(herramientas[i] != null){
                contadorLote++;
            }
        }
        return contadorLote;
    }

    public Productos getProductoEnPosicion(int i){
        System.out.println(herramientas[i]);
        return herramientas[i];
    }

    public void addProducto(Productos producto){
        herramientas[n] = producto;
        n++;
    }

    public void mostrarLoteCompleto(){
        for(int i=0; i < herramientas.length; i++){
            if(herramientas[i] != null){
                System.out.println(herramientas[i]);
            }
        }
    }

    @Override
    public Productos mejorValorado(LoteProductos loteProductos) {
        double mejorValoracion = Double.MIN_VALUE;
        Productos productoMejorValorado = null;
        for(int i=0; i < loteProductos.getTotalProductos(); i++){
            Productos productoActual = loteProductos.getProductoEnPosicion(i);
            double valoracionActual = productoActual.getIndiceValoracion();
            if(valoracionActual < mejorValoracion){
                mejorValoracion = valoracionActual;
                productoMejorValorado = productoActual;
            }
        }
        return productoMejorValorado;
    }

    @Override
    public int masBarato(){
        int posicionProductoMasBarato = 0;
        double masBarato = Double.MAX_VALUE;
        for(int i=0; i < herramientas.length; i++){
            if(masBarato > herramientas[i].getPrecio()){
                masBarato = herramientas[i].getPrecio();
                posicionProductoMasBarato = i;
            }
        }
        return posicionProductoMasBarato;
    }

    @Override
    public Productos valoracionPrecio(LoteProductos loteProductos) {
        double menorPrecio = Double.MAX_VALUE;
        Productos productoMasBarato = null;
        for(int i=0; i < loteProductos.getTotalProductos(); i++){
            Productos productoActual = loteProductos.getProductoEnPosicion(i);
            double precioActual = productoActual.getPrecio();
            if(precioActual < menorPrecio){
                menorPrecio = precioActual;
                productoMasBarato = productoActual;
            }
        }
        return productoMasBarato;
    }
}