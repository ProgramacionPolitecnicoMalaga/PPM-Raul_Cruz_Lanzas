package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBSD {
    public Connection conectar() throws SQLException {
        String url = "jdbc:mysql://51.68.123.197:3306/Validados";
        String user = "usuarioBD";
        String pass = "qwerty98";
        return DriverManager.getConnection(url,user, pass);
    }
}
