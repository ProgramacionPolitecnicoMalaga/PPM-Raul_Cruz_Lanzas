import java.util.LinkedList;

public class PilaEnteros {
    LinkedList<Integer> numeros;

    public PilaEnteros(){
        numeros = new LinkedList<>();
    }

    public void insertar(Integer e){
        numeros.addFirst(e);
    }

    public Integer sacar() {
        return numeros.removeFirst();
    }

    public Integer cabeza(){
        return numeros.peek();
    }
}
