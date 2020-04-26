package DAO;

import EXCEPTIONS.ConexionException;
import EXCEPTIONS.QueryException;
import MODELO.Credencial;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CredencialDAO {
    ArrayList<Credencial> mostrar();
    boolean insertar (Credencial credencial);
    Credencial buscarUsuario(String nombre) throws ConexionException, SQLException, QueryException;
    Integer buscarId(String nombre);
    ArrayList<Credencial> mostrarNombres();
}
