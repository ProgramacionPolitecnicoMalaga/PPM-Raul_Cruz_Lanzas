package Algoritmos;

import java.security.NoSuchAlgorithmException;

public class Encriptador {
    private Algoritmo algoritmo;
    private String clave;

    public Encriptador(String algortimo, String clave){
        this.clave = clave;
        try{
            setAlgoritmo(algortimo);
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
    }

    public void setAlgoritmo(String algoritmo) throws NoSuchAlgorithmException{
        if(algoritmo.equals("SHA")){
            this.algoritmo = new MD5();
        } else{
            this.algoritmo = new BcCry();
        }
    }

    public String generarHash() throws NoSuchAlgorithmException{
        return algoritmo.generarHash(clave);
    }

    public boolean verificarClave(String hash) throws NoSuchAlgorithmException{
        return algoritmo.verificarSaltedPassword(clave, hash);
    }
}
