package SERVICIO;

import Algoritmos.Encriptador;
import DAO.CredencialDAO;
import DAO.CredencialImplementada;
import DAO.MensajeDAO;
import DAO.MensajeImplementado;
import EXCEPTIONS.ConexionException;
import EXCEPTIONS.QueryException;
import MODELO.Credencial;
import MODELO.Mensaje;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Servicio {
    private CredencialDAO credencialDAO;
    private MensajeDAO mensajeDAO;

    public Servicio(){
        credencialDAO = new CredencialImplementada();
        mensajeDAO = new MensajeImplementado();
    }

    public ArrayList<Credencial> mostrarNombreCredencial(){
        return credencialDAO.mostrarNombres();
    }

    public ArrayList<Credencial> mostrarCredenciales(){
        return credencialDAO.mostrar();
    }

    public void agregarCredenciales(String nick, String password, String algoritmo) throws NoSuchAlgorithmException{
        String encriptado = encriptador(password, algoritmo);
        credencialDAO.insertar(new Credencial(nick, encriptado, algoritmo));
    }

    public Credencial buscarCredencial(String nick) throws ConexionException, QueryException, SQLException{
        return credencialDAO.buscarUsuario(nick);
    }

    public int buscarIdCredencial(String nick){
        return credencialDAO.buscarId(nick);
    }

    public String encriptador (String clave, String algoritmo) throws NoSuchAlgorithmException{
        Encriptador encriptador = new Encriptador(clave, algoritmo);
        return encriptador.generarHash();
    }

    public boolean verificarEncriptador (String clave, String nombre) throws NoSuchAlgorithmException, ConexionException, QueryException, SQLException{
        Credencial credencial = buscarCredencial(nombre);
        Encriptador encriptador = new Encriptador(clave, credencial.getAlgoritmo());
        return encriptador.verificarClave(credencial.getClave());
    }

    public void agregarMensaje (String titulo, String texto, String emisor, String receptor, String fecha, int idRemitente) throws SQLException{
        mensajeDAO.insertar(new Mensaje(titulo, texto, emisor, receptor, idRemitente));
    }

    public ArrayList<Mensaje> enseñarMensaje(){
        return mensajeDAO.mostrar();
    }

    public Mensaje encontrarMensaje(String emisor) throws ConexionException, SQLException{
        return mensajeDAO.buscarMensaje(emisor);
    }
}
