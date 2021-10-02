package com.win;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

	// how to work with a database
        System.out.println("Program Initiated"); // this is small log
        // connecting to database

        try {
            int i = Student.insertData();
            if(i != 0){
                System.out.println("Data inserted successfully");
            }else{
                System.out.println("Error in data insert");
            }
            ResultSet rs = Student.displayData();

            while(rs.next()){
                String id = rs.getString("id");
                String fname = rs.getString("first_name");
                String lname = rs.getString("last_name");

                System.out.println("ID = "+id+" First Name = "+fname+" Last Name = "+lname);
            }

        }catch(ClassNotFoundException e){
            System.out.println("Driver not found");
        }
        catch(SQLException e){
            System.out.println("Database error");
            e.printStackTrace();
        }

    }


}
