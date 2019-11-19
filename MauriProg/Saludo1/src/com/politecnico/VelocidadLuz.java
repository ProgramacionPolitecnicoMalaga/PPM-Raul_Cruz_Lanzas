package com.politecnico;

import java.util.Scanner;

public class VelocidadLuz {
    public static void main (String[]args){
    int velocidadLuz = 300000;
    long dias;
    long distancia;
    Scanner lector = new Scanner(System.in);

    System.out.print("Introduce el numero de dias");

    dias = lector.nextLong();

    distancia =velocidadLuz * dias * 24 * 60 * 60;

    System.out.println("La luz recorrerá un total de" +distancia);
    }
}

