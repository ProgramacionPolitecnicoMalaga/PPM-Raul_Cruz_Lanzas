public class Main {
    public static void main(String[] args) {

        FigurasGeometricas figurasGeometricas = new Circulos("rojo", 4.5);
        FigurasGeometricas figurasGeometricas1 = new Cuadrados("naranja", 34);
        FigurasGeometricas figurasGeometricas2 = new Triangulos("verde", 23, 3.2);

        FigurasGeometricas[] figuras = new FigurasGeometricas[3];
        figuras[0] = figurasGeometricas;
        figuras[1] = figurasGeometricas1;
        figuras[2] = figurasGeometricas2;

        for(int i = 0; i < figuras.length; i++){
            figuras[i].calcularArea();
            System.out.println(figuras[i]);
        }
    }
}
