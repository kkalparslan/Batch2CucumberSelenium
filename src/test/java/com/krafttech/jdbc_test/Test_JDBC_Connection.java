package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Connection {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.product";

        try {
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("CONNECTION OK");
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(query);
            resultSet.next();
            resultSet.next();
            resultSet.next();
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
            System.out.println(resultSet.getString(5));
            System.out.println(resultSet.getString(6));
        } catch (SQLException e) {
            System.out.println("CONNECTION ERROR" +e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
