package com.krafttech.jdbc_test;

import java.sql.*;

public class Deneme {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.150.3:1433;DatabaseName=u0583688_vlk;" +
                "encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_vlk";
        String password="VolkanAntalya159*";
        String query="select * from u0583688_vlk.dbo.regions";

        try {
            Connection connection= DriverManager.getConnection(url,userName, password);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(query);
            System.out.println("connection success");
            resultSet.next();
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
