import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        int Isabel[] = {7, 7, 10, 6, 4};
        int Vicente[] = {4, 7, 5, 4, 5};
        double mediaIsabel = 0;
        int totalIsabel = 0;
        int maxIsabel = 0;
        double mediaVicente = 0;
        int totalVicente = 0;
        int maxVicente = 0;

        for (int i = 0; i < Isabel.length; i++) {
            if (maxIsabel < Isabel[i]) {
                maxIsabel = Isabel[i];
            }
            totalIsabel += Isabel[i];
        }
        mediaIsabel = (double) totalIsabel / Isabel.length;

        for (int i = 0; i < Vicente.length; i++) {
            if (maxVicente < Vicente[i]) {
                maxVicente = Vicente[i];
            }
            totalVicente += Vicente[i];
        }
        mediaVicente = (double) totalVicente / Vicente.length;

        if (maxIsabel > maxVicente) {
            System.out.println("Promedio de ventas" + "\nVicente" + " " + mediaVicente + "\n Isabel " + " " + mediaIsabel);
            System.out.println("Isabel es la vendedora de la semana con " + maxIsabel + " items en un dia");
        } else if (maxIsabel < maxVicente) {
            System.out.println("Promedio de ventas" + "\nVicente" + " " + mediaVicente + "\n Isabel " + " " + mediaIsabel);
            System.out.println("Vicente es la vendedora de la semana con " + maxVicente + " items en un dia");
        }
    }
}
