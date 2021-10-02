package com.win;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con;

        System.out.println("Loading the driver");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soono","root","");
        System.out.println("Connected");
        return con;
    }
}
