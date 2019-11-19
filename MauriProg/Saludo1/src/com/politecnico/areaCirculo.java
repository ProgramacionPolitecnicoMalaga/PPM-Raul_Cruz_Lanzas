package com.politecnico;
import java.util.Scanner;

public class areaCirculo {

    public static void main(String[] args){
        double areaCirculo;
        double radioCirculo;
        Scanner lector = new Scanner(System.in);

    System.out.print("Introduce el radio ");
    radioCirculo = lector.nextDouble();

    areaCirculo = Math.PI * Math.pow(radioCirculo,2);
    System.out.print("El area es "+ areaCirculo);
    }
}
