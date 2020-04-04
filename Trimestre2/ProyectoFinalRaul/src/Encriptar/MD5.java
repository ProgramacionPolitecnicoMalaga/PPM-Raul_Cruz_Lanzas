package Encriptar;

import java.security.NoSuchAlgorithmException;

public class MD5 implements Algoritmo{
    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        return null;
    }

    @Override
    public boolean verificarSaltedPassword(String password, String passwordHash) throws NoSuchAlgorithmException {
        return false;
    }
}
