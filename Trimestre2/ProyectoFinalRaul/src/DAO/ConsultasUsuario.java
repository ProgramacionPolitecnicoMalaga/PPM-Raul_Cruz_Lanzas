package DAO;

import Modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class ConsultasUsuario implements UsuarioDAO{
    @Override
    public ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String querry = "SELECT * FROM Usuario";

        try {
            Connection con = ConexionBSD.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("clave"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
                usuarios.add(usuario);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public boolean insertar(Usuario u) {
        boolean registrado = false;

        try {
            Connection con = ConexionBSD.conexionBD();
            String query = "INSERT INTO registro (usuario,contraseña, algoritmo)" + " VALUES (?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, u.getNombre());
            stm.setString (2, u.getContraseña());
            stm.setString (3, u.getAlgoritmo());
            registrado = true;
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Usuario buscarUsuario(String nick) {
        Usuario usuario = new Usuario();
        String querry = "SELECT * FROM Usuario WHERE nombre LIKE '%"+nick+"%'";

        try {
            Connection con = ConexionBSD.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                usuario.setNombre(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
                usuario.setBloqueado(rs.getBoolean("estaBloqueado"));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public boolean eliminar(String nick) {
        boolean eliminar = false;
        String querry = "DELETE FROM Usuario WHERE nombre = '"+nick+"'";

        try {
            Connection  con = ConexionBSD.conexionBD();
            Statement stm = con.createStatement();
            stm.execute(querry);
            eliminar = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eliminar;
    }
}
