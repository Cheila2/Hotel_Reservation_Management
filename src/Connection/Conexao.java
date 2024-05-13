package Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

public class Conexao {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/hotel";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USER,PASSWORD);
            //System.out.println("Conectado!");
            return con;
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão : ", e);
        }

    }

    public static void closeConnection(Connection con){

        try {
            if(con != null)
                con.close();
        } catch (SQLException e) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt){

        closeConnection(con);
        try {
            if(stmt != null)
                stmt.close();
        } catch (SQLException e) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){

        closeConnection(con, stmt);
        try {
            if(rs != null)
                rs.close();
        } catch (SQLException e) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
