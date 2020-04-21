import Lectores.LectorENV;
import Viewer.GeneradorDeViewer;
import Viewer.InterfaceDataViewer;

public class Main {
    public static void main(String[] args) {
        LectorENV lectorENV = new LectorENV();
        GeneradorDeViewer generadorDeViewer = new GeneradorDeViewer();
        InterfaceDataViewer dataViewer = generadorDeViewer.getViewerPorString(lectorENV.getDataType());
        System.out.println(dataViewer.mostrarContenido());
    }
}
