package ControladorGeneralConsultas;


import DAO.Consulta;
import Encriptar.Encriptar;
import Modelo.Credencial;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorConsultas {
    Consulta cons;
    private ControladorConsultas usuarioDAO;

    public ControladorConsultas() {
        this.cons = new Consulta();
    }

    public ArrayList<Credencial> mostrarTodos() throws SQLException {
        ArrayList<Credencial> credencials = cons.mostrarCredenciales();
        return credencials;
    }

    public void addCredencial(String nick, String password, String algoritmo) throws NoSuchAlgorithmException {
        String encriptado = encriptador(password, algoritmo);
        Credencial credencial = new Credencial(nick, encriptado, algoritmo);
        cons.insertar(credencial);
    }

    public Credencial buscarUsuario(String nick) {
        return usuarioDAO.buscarUsuario(nick);
    }

    public void eliminarUusario(String nick) {
        usuarioDAO.eliminarUusario(nick);
    }

    private String encriptador(String password, String algoritmo) throws NoSuchAlgorithmException {
        Encriptar encriptar = new Encriptar(password, algoritmo);
        return encriptar.generarHash();
    }

    public boolean verificarEncriptador(String clave, String algoritmo, Credencial usuario) throws NoSuchAlgorithmException {
        usuario = buscarUsuario(usuario.getNombre());
        Encriptar encriptador = new Encriptar(clave, algoritmo);
        return encriptador.verficarClave(usuario.getHash());
    }
}

