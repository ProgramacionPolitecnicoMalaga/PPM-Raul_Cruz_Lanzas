import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        int Isabel [] = {7,7,10,6,4};
        int Vicente [] = {4,7,5,4,5};
        int numeroItems = 0;

        System.out.println("Introduce un numero de items: ");
        numeroItems = lectorTeclado.nextInt();

        for(int i = 0; i < (Isabel.length |Vicente.length); i++){
            if(numeroItems == Isabel[i]){
                System.out.println("Isabel ha hecho de ventas "+ Isabel[i]+ " al dia "+ i);}
                else if(numeroItems == Vicente[i]){
                    System.out.println("Vicente ha hecho de ventas "+ Vicente[i]+ " al dia "+ i);}
                    else if(numeroItems == (Isabel[i] & Vicente[i])){
                        System.out.println("Isabel y Vicente ha hecho de ventas "+ numeroItems+ " al dia "+ i);
                    }
        }
    }
}
