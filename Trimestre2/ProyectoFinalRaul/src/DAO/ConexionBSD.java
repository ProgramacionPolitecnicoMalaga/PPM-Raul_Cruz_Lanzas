package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBSD {
    public static Connection conexionBD() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://51.68.123.197:3306/Validados", "usuarioBD", "qwerty98");
            if (con != null) {
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
        return con;
    }
}
