package com.win;

import java.sql.*;

public class Student {

    public static int insertData() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Statement stmt = null;

        con = DBConnector.getConnection();
        stmt = con.createStatement();
        String queryString = "insert into Student (id, first_name, last_name) values ('00120','Asel','Mendis')";
        int i = stmt.executeUpdate(queryString);
        //System.out.println(1);
        return i;


    }

    public static ResultSet displayData() throws ClassNotFoundException, SQLException{

        Connection con = null;
        Statement stmt = null;
        con = DBConnector.getConnection();

        stmt = con.createStatement();
        String queryString2 = "select * from Student";
        ResultSet rs = stmt.executeQuery(queryString2);
        return rs;

    }


}
