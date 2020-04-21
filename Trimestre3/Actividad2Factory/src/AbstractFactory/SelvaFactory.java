package AbstractFactory;

import Elementos.Jugador.Indiana;
import Elementos.Jugador.Jugador;
import Elementos.Obstaculos.Carcelero_Turco;
import Elementos.Obstaculos.Obstaculos;
import Elementos.Villano.Molaram;
import Elementos.Villano.Villano;

public class SelvaFactory implements ElementosFactory {
    @Override
    public Jugador crearJugador() {
        return new Indiana();
    }

    @Override
    public Villano crearVillano() {
        return new Molaram();
    }

    @Override
    public Obstaculos crearObstaculo() {
        return new Carcelero_Turco();
    }
}
