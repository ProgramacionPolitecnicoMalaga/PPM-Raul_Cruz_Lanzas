package Modelo;

import Strategy.*;

public class SelectorDeseoNiño {

    public static DeseoNiño getSelectorDeseoNiño(int selector){
        switch (selector){
            case DeseoNiño.Intento1:
                return new Intento1();
            case DeseoNiño.Intento2:
                return new Intento2();
            case DeseoNiño.Intento3:
                return new Intento3();
            case DeseoNiño.Intento4:
                return new Intento4();
            default:
                return new Intento5Default();
        }
    }
}
