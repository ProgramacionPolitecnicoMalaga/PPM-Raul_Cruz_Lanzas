import Strategy.DeseoNiño;
import Modelo.Niño;

public class App {
    public static void main(String[] args) {
        DeseoNiño deseoNiño = new DeseoNiño();
        Niño niño = new Niño("Jacinto García");
        niño.setDeseo("un paquete de galletas");

        for (int i=1; i<5; i++){
            System.out.print("En el intento " + i + " " + niño.getNombre() + " ");
            System.out.println(deseoNiño.conseguirDeseo(i));
        }
    }
}


