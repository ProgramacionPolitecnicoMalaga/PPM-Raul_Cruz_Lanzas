import AbstractFactory.DesiertoFactory;
import AbstractFactory.ElementosFactory;
import AbstractFactory.EspacioFactory;
import AbstractFactory.SelvaFactory;
import Elementos.Jugador.Jugador;
import Elementos.Obstaculos.Obstaculos;
import Elementos.Villano.Villano;

import java.util.Scanner;

public class SelectorJuego {
    public static ElementosFactory elementosFactory;

    public static void main(String[] args) {
        inicializar();
        Jugador jugador = elementosFactory.crearJugador();
        Villano villano = elementosFactory.crearVillano();
        Obstaculos obstaculos = elementosFactory.crearObstaculo();

        System.out.println("Se ha creado el jugador: "+ jugador.getNombreJugador());
        System.out.println("Se ha creado el villano: "+ villano.getNombreVillano());
        System.out.println("Se ha creado el obstaculo: "+ obstaculos.getNombreObstaculo());
    }

    public static void inicializar(){
        Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elige un escenario: 1-Selva, 2-Desierto o 3-Espacio");
        int escenario = lectorTeclado.nextInt();

        switch (escenario){
            case 1:
                elementosFactory = new SelvaFactory();
                break;
            case 2:
                elementosFactory = new DesiertoFactory();
                break;
            case 3:
                elementosFactory = new EspacioFactory();
                break;
            default:
                throw new IllegalArgumentException("No existe el escenario");
        }
    }
}
