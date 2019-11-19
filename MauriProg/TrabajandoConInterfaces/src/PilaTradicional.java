public class PilaTradicional implements SecuenciaDeDatos{
    Personas[] pila;
    int cabeza;

    public PilaTradicional(int tamaño){
        pila = new Personas[tamaño];
        cabeza = -1;
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
