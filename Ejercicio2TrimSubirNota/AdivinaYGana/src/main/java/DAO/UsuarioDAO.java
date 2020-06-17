package DAO;

import AdivinaYGana.Modelo.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private DBConn dbConn;

    public UsuarioDAO() throws SQLException {
        this.dbConn = new DBConn("192.168.2.216", "3306", "usuarios", "raul", "1234");
    }

    public boolean create(Usuario usuario) throws SQLException{
        //Insertas
        dbConn.queryUpdate("INSERT INTO usuarios(usuario,password) VALUES('" + usuario.getUsuario() + "'," + usuario.getPassword() + ")");

        //Recuperas con todos los datos, tambien el id
        ResultSet result = dbConn.query("SELECT * FROM usuarios WHERE usuario = '" + usuario.getUsuario() + "' AND password =" + usuario.getPassword());
        if (result.next()) {
            int id = result.getInt("id");
            usuario.setId(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Usuario> readAll() throws SQLException{
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ResultSet resultado = dbConn.query("SELECT * FROM usuarios");
        while (resultado.next()) {
            int id = resultado.getInt("id");
            String usuario = resultado.getString("usuario");
            String password = resultado.getString("password");

            Usuario usuarios = new Usuario(usuario, password);
            listaUsuarios.add(usuarios);
        }
        return listaUsuarios;
    }

    public boolean update(Usuario usuario)throws SQLException{
        int filasAfectadas = dbConn.queryUpdate("UPDATE usuarios SET usuario = '" + usuario.getUsuario() + "'," + "password=" + usuario.getPassword() + " WHERE id = " + usuario.getId());
        return filasAfectadas == 1;
    }

    public boolean delete(Usuario usuario) throws SQLException{
        String consulta = "DELETE FROM usuarios WHERE id= " + usuario.getId();
        int filaAfectadas = dbConn.queryUpdate(consulta);
        return filaAfectadas == 1;
    }

    public void deleteAll() throws SQLException{
        int filaAfectadas = dbConn.queryUpdate("DELETE FROM usuarios");
    }
}
