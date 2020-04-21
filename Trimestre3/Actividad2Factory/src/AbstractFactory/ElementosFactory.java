package AbstractFactory;

import Elementos.Jugador.Jugador;
import Elementos.Obstaculos.Obstaculos;
import Elementos.Villano.Villano;

public interface ElementosFactory {
    public Jugador crearJugador();
    public Villano crearVillano();
    public Obstaculos crearObstaculo();
}
