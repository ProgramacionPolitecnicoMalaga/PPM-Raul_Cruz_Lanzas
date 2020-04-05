package Algoritmos;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements Algoritmo{
    private MessageDigest messageDigest;

    public MD5() throws NoSuchAlgorithmException{
        messageDigest = MessageDigest.getInstance("MD5");
    }

    @Override
    public boolean verificarHash(String password, String passwordHash) throws NoSuchAlgorithmException {
        String nuevoHash = generarHash(password);
        return nuevoHash.equals(passwordHash);
    }

    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        if (messageDigest == null)
            throw new NoSuchAlgorithmException("No existe el algoritmo de hash");
        byte[] bytes = messageDigest.digest(password.getBytes());
        return new String(Hex.encodeHex(bytes));
    }
}

