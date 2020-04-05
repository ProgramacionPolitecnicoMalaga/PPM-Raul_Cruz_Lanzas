package Algoritmos;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;

public class BcCry implements Algoritmo{
    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    @Override
    public boolean verificarHash(String password, String passwordHash) throws NoSuchAlgorithmException {
        return BCrypt.checkpw(password,passwordHash);
    }
}
