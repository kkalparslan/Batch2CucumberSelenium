package com.krafttech.jdbc_test;

import java.sql.*;
import java.util.Arrays;

public class Test_JDBC_2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.product";

        try {
            Connection connection= DriverManager.getConnection(url,userName, password);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(query);
            resultSet.next();
//            System.out.println(resultSet.getRow()+".sıra --> "+ resultSet.getString(2));
//            System.out.println(resultSet.getString("model_year"));
//            resultSet.next();
//            System.out.println(resultSet.getRow()+".sıra --> "+ resultSet.getString(2));
//            String model_year=resultSet.getString("model_year");
//            System.out.println("model_year = " + model_year);
//            int model_year2=resultSet.getInt("model_year");
//            System.out.println("model_year2 = " + model_year2);
//            resultSet.next();
//            System.out.println(resultSet.getRow()+".sıra --> "+ resultSet.getString(2));
//            resultSet.next();
//            System.out.println(resultSet.getRow()+".sıra --> "+ resultSet.getString(2));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
