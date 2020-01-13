public class Main {
    public static void main(String[] args) {
        FigurasGeometricas[] figurasGeometricas = new FigurasGeometricas[3];
        figurasGeometricas[0] = new Circulos("circulo1", "azul", 15);
        figurasGeometricas[1] = new Cuadrados("cuadrado1", "naranja", 34);
        figurasGeometricas[2] = new Triangulos("triangulo1", "verde", 19, 4);

        for(int i = 0; i < figurasGeometricas.length; i++){
            System.out.println(figurasGeometricas[i]);
        }
    }
}
