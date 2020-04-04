package Encriptar;

import java.security.NoSuchAlgorithmException;

public class Encriptar {
     String clave;
     Algoritmo algoritmo;

    public Encriptar(String clave, String algoritmo) throws NoSuchAlgorithmException {
        this.clave = clave;
            setAlgoritmo(algoritmo);
    }

    public void setAlgoritmo(String algoritmo) {
        if (algoritmo.equals("BC"))
            this.algoritmo = new BcCry();
        else if (algoritmo.equals("MD5"))
            this.algoritmo = new MD5();
    }

    public String generarHash() throws NoSuchAlgorithmException {
        return algoritmo.generarHash(clave);
    }

    public boolean verficarClave(String hash) throws NoSuchAlgorithmException {
        return algoritmo.verificarSaltedPassword(clave, hash);
    }
}
