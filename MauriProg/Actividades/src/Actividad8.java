public class Actividad8 {
    public static void main(String[] args) {
        int altura = 1;
        int espacios = 9;

        while (altura <= 9) {

            for (int i = 0; i < espacios; i++) {   // i parte de 0 ; pero llegara al valor de espacios;
                System.out.print(" ");
            }

            for (int i = 1; i < altura; i++) {
                System.out.print(i);
            }
            for (int i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            espacios--;      //por cada vuelta del bucle while se resta 1 ;
            altura++;
        }

    }
}
