package com.politecnico;

public class ManejandoArrays {
    public static void main(String[] args) {
        String[] diasSemana = new String[7];

        int diaSemana;

        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sabado";
        diasSemana[6] = "Domingo";

        diaSemana = 3;

        //Arrays dimensionales

        String[][] horario = {
                {"Lunes","SINF","SINF","SINF","PROG","PROG","PROG"},
                {"Martes","FOL","FOL","PROG","PROG","ED","ED"},
                {"Miercoles","PROG","PROG","PROG","LM","LM","FOL"},
                {"Jueves","LM","LM","BD","BD","BD","ED"},
                {"Viernes","BD","BD","BD","SINF","SINF","SINF"},
        };

        System.out.println(horario[1][4]);

    }
}
