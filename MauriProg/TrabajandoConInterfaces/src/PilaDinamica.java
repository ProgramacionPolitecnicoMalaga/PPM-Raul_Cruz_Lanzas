public class PilaDinamica implements SecuenciaDinamica {

    Personas[] pila;
    int cabeza;

    public PilaDinamica(int tamaño){
        pila = new Personas[tamaño];
    }

    @Override
    public Personas getElementoEnPosicion(int i) {
        if(cabeza >= 1)
            return pila[i];
        else
            return null;
    }

    @Override
    public void removeElementoEnPosicion(int i) {
        if((cabeza > -1) && (i <= cabeza)){
            for(int j=1; j < cabeza-1; j++)
            pila[j] = pila[j+1];
            cabeza--;
        }
    }

    @Override
    public void insertar(Personas personas) {
        if(cabeza < pila.length){
            cabeza++;
            pila[cabeza] = personas;
        }
    }

    @Override
    public Personas extraer() {
        Personas personas = null;
        if(cabeza >= 0){
            personas = pila[cabeza];
            cabeza--;
        }
        return personas;
    }
}
