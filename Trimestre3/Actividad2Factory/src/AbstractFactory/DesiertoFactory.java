package AbstractFactory;

import Elementos.Jugador.Jugador;
import Elementos.Jugador.Patton;
import Elementos.Obstaculos.Obstaculos;
import Elementos.Obstaculos.Tanques;
import Elementos.Villano.Rommel;
import Elementos.Villano.Villano;

public class DesiertoFactory implements ElementosFactory {
    @Override
    public Jugador crearJugador() {
        return new Patton();
    }

    @Override
    public Villano crearVillano() {
        return new Rommel();
    }

    @Override
    public Obstaculos crearObstaculo() {
        return new Tanques();
    }
}
