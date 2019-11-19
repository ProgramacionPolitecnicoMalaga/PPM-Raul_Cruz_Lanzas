package com.politecnico;

public class CadenaDeCaracteres {
    public static void main(String[] args) {
        String cadena1 = "Pepe;Juan;Maria";
        String cadena2 = "PEPE;Juan;Maria"; //Case sensitive

        cadena1 = cadena1 + ";Ana";
        StringBuffer s = new StringBuffer();
        System.out.println(s.append("Hola").append(" ").append("mundo").toString());
        s.insert(4, " a todo el ");
        System.out.println(s.toString());
        /*System.out.println(cadena1.equals(cadena2));*/
        /*System.out.println(cadena1 == cadena2);*/
        /*cadena1.toLowerCase().equals(cadena2.toLowerCase());*/

        /*String subcadena1, subcadena2, subcadena3;

        subcadena1 = cadena1.substring(0,4);
        subcadena2 = cadena1.substring(5,10).toUpperCase();
        subcadena3 = cadena1.substring(11);*/

        String[] nombres = cadena1.split(";");

        System.out.println(nombres[2]);
        /*System.out.println(cadena1.indexOf("cadena",11));*/
        /*cadena1 = subcadena1.concat(subcadena2).concat(subcadena3);

        System.out.println(cadena1);*/
    }
}
