import Modelo.Niño;

public class App {

    public static void main(String[] args) {
        Niño niño = new Niño("Jacinto Garcia");
        niño.setDeseo("un paquete de galletas");

        for(int i=1; i<5; i++) {
            System.out.println("En el intento "+i+" "+niño.getNombre()+ " ");
            System.out.println(niño.conseguirDeseo(i));
        }
    }
}


