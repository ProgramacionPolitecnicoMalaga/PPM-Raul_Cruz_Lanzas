package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConn {
    private final static String driver = "com.mysql.cj.jdbc.Driver";
    private final static String url = "jdbc:mysql://51.68.123.197:3306/Customer";
    private final static String usuario = "usuarioBD";
    private final static String password = "qwerty98";
    private Connection conn = null;
    private static DbConn instance = null;

    public DbConn(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Connection getConn(){
        return conn;
    }

    public static DbConn getInstance() throws SQLException{
        if (instance == null) {
            instance = new DbConn();
        } else if(instance.getConn().isClosed()){
            instance = new DbConn();
        }
        return instance;
    }

    public ResultSet read(String consulta) throws SQLException {
        return conn.prepareStatement(consulta).executeQuery();
    }

    public int update(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
