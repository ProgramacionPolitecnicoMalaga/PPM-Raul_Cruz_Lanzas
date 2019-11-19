package com.politecnico;

public class Operadores {
    public static void main(String[] args) {

        int numeroBinario = 0b100101111;
        int numeroBinarioDesplazado = numeroBinario >>> 2;
        System.out.println(numeroBinarioDesplazado);
        System.out.println(Integer.toBinaryString(numeroBinarioDesplazado));

        /*int numerador = 0;
        int denominador = 10;

        System.out.println((numerador != 0) && (numerador/denominador > 10));
        /*boolean expr1 = (9>10);
        boolean expr2 = (11<20);

        System.out.println(expr1 | expr2);
        /*int i = 5;
        int j = i++ * 2;

        i *= 2;
        i %= 2;
        System.out.println(j);
        System.out.println(i);
        /*int modulo = 6 % 4;
        int siguienteTarea=0;
        int totalTareas=5;
        //Hacer algo con la tarea actual (0)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);
        //Hacer algo con la tarea actual (1)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);
        //Hacer algo con la tarea actual (2)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);
        //Hacer algo con la tarea actual (3)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);
        //Hacer algo con la tarea actual (4)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);
        //Hacer algo con la tarea actual (5)
        siguienteTarea = siguienteTarea + 1;
        System.out.println("La siguiente tarea es: "+siguienteTarea);*/
    }
}
