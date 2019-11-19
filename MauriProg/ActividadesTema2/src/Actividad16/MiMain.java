package Actividad16;

public class MiMain {
    public static void main(String[] args) {
        Jugadores jugador1 = new Jugadores("Verde", "Raul");
        jugador1.avanzarCasillas(1);
        jugador1.avanzarCasillas(4);
        jugador1.avanzarCasillas(6);
        jugador1.avanzarCasillas(3);
        jugador1.historial();
        System.out.println("------------------------");
        jugador1.undo();
        jugador1.undo();
        jugador1.undo();
        jugador1.historial();
        System.out.println("------------------------");
        jugador1.undo();
        jugador1.historial();
        System.out.println("------------------------");
        jugador1.avanzarCasillas(3);
        jugador1.historial();
        System.out.println("------------------------");
        jugador1.undo();
        jugador1.historial();
        System.out.println("-------------------------");
        jugador1.redo();
        jugador1.historial();
        System.out.println("-------------------------");
        jugador1.retrocederCasillas(3);
        jugador1.historial();
        System.out.println("-------------------------");
        jugador1.redo();
        jugador1.historial();
        System.out.println("-------------------------");
    }
}
