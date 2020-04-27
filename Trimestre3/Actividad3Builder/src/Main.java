import Builder.Builder;
import PackHotel.Pack;
import Builder.Director;

import java.util.Scanner;

public class Main {

    public static Pack pack;

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elige el tipo de pack que deseas: \n"+
                            "1. Pack basico \n"+
                            "2. Pack romance \n"+
                            "3. Pack familiar \n"+
                            "4. Pack padres relajados \n"+
                            "5. Pack deluxe \n"+
                            "6. Pack deluxe familiar");

        int tipoPack = lectorTeclado.nextInt();

        Builder packBuilder = new Builder();
        Director packDirector = new Director(packBuilder);

        switch (tipoPack){
            case 1:
                pack = packDirector.contratarPackBasico();
                break;
            case 2:
                pack = packDirector.contratarPackRomance();
                break;
            case 3:
                pack = packDirector.contratarPackFamiliar();
                break;
            case 4:
                pack = packDirector.contratarPackPadresRelajados();
                break;
            case 5:
                pack = packDirector.contratarPackDeluxe();
                break;
            case 6:
                pack = packDirector.contratarPackDeluxeFamiliar();
                break;
        }
        System.out.println(pack);
    }
}
