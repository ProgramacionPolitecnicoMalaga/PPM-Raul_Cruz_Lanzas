package Actividad15;

public class MiMain {
    public static void main(String[] args) {
        RankingPilotos rankingPilotos = new RankingPilotos();

        System.out.println("\n Parrilla de salida: \n");
        rankingPilotos.añadirPilotos();
        rankingPilotos.informacionPilotos();

        System.out.println("\n -------------------------------");
        System.out.println("Pilotos ordenados por nombre: \n");
        rankingPilotos.ordenarPilotosPorNombre();
        rankingPilotos.ordenarPilotosPorPosicionDeSalida();

        System.out.println("\n -------------------------------");
        System.out.println("El piloto Hamilton L. adelanta hasta la tercera posición y Magnussen K. hasta la novena: \n");
        rankingPilotos.adelantarPiloto(rankingPilotos.getPiloto(4), 4,2);
        rankingPilotos.adelantarPiloto(rankingPilotos.getPiloto(11), 11,8);

        System.out.println("\n -------------------------------");
        System.out.println("Los pilotos Albon A. y Grosjean R. son descalificados: \n");
        rankingPilotos.getPiloto(5).setDescalificado();
        rankingPilotos.getPiloto(14).setDescalificado();
        rankingPilotos.eliminarPilotosDescalificados();
        rankingPilotos.informacionPilotos();

        System.out.println("\n -------------------------------");
        System.out.println("Los pilotos vuelven a ser ordenados según su orden inicial de salida, teniendo en cuenta que los decalificados no aparecen: \n");
        rankingPilotos.ordenarPilotosPorPosicionDeSalida();
        rankingPilotos.informacionPilotos();
    }
}
