package project_ppbo_kelompok1;

import java.sql.*;

public class Config {
    private static Connection MySQLConfig;
    public static Connection configDb()throws SQLException{
        try {
            String url= "jdbc:mysql://localhost:3306/project_ppbo_kelompok1";
            String user= "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig= DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            System.err.println("Koneksi Gagal " + e.getMessage());
        }
        return MySQLConfig;
    }
}

