package AbstractFactory;

import Elementos.Jugador.Jugador;
import Elementos.Jugador.USS_Enterprise;
import Elementos.Obstaculos.Naves_Kinglon;
import Elementos.Obstaculos.Obstaculos;
import Elementos.Villano.Khan;
import Elementos.Villano.Villano;

public class EspacioFactory implements ElementosFactory {
    @Override
    public Jugador crearJugador() {
        return new USS_Enterprise();
    }

    @Override
    public Villano crearVillano() {
        return new Khan();
    }

    @Override
    public Obstaculos crearObstaculo() {
        return new Naves_Kinglon();
    }
}
