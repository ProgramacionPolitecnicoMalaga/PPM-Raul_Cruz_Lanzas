package Actividad9;

public class Actividad9Main {

    public static void main(String[] args) {
        Figuras[] listaFiguras = new Figuras[3];
        listaFiguras[0] = new Cuadrado("cuadrado1", "verde", 11);
        listaFiguras[1] = new Triangulo("triangulo1", "azul", 21, 12);
        listaFiguras[2] = new Circulo("circulo1", "marron", 12);

        for(int i=0; i < listaFiguras.length; i++){
            System.out.println(listaFiguras[i]);
        }
    }
}
