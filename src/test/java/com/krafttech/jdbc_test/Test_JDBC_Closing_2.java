package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Closing_2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.brand";

        /**
         * aşağıda connection close için (autocloseable) best practice uyguladık.try (connection.., statement.., resultSet..)
         */

        try (Connection connection= DriverManager.getConnection(url,userName,password);
             Statement  statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet  resultSet = statement.executeQuery(query);)
        {
            resultSet.next();
            System.out.println(resultSet.getString(2));

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connection kapandı");
    }
}
