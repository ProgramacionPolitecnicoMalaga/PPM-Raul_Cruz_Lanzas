package AdivinaYGana.LogicaDeNegocio;

import AdivinaYGana.Modelo.Usuario;
import DAO.UsuarioDAO;

import java.sql.SQLException;
import java.util.List;

public class ControladorUsuario {
    public boolean crearUsuario(String usuario, String password) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.create(new Usuario(usuario, password));
    }

    public List<Usuario> getUsuarios() throws SQLException{
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.readAll();
    }
}
