package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bdd {
    protected static String jbdcURL = "jdbc:mysql://localhost:8889/Art?autoReconnect=true&useSSL=false";
    protected static String userName = "root";
    protected static String userPassword = "root";
    protected Connection jbdcConnection;

    public static Connection getConnect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jbdcURL, userName, userPassword);
            if (con != null) {
                return con;

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deconnect() {
        try {
            jbdcConnection.close();


        }catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
