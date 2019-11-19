package Actividad2;

import java.util.Scanner;

public class Caja {
    Scanner lectorTeclado = new Scanner(System.in);

    int anchura, altura, profundidad;

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    //...

    boolean esIgualQue(Caja caja) {
        if ((caja.getAnchura() == anchura) &&
                (caja.getAltura() == altura) &&
                (caja.getProfundidad() == profundidad))
            return true;
        else return false;
    }

    void clonar(Caja caja) {
        anchura = caja.getAnchura();
        altura = caja.getAltura();
        profundidad = caja.getProfundidad();
    }
}