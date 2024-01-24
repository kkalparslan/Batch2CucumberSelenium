package com.krafttech.jdbc_test;

import java.sql.*;

public class NewClassWithBumor {

    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:sqlserver://94.73.150.3:1433;DatabaseName=u0583688_vlk;" +
                "encrypt=true;trustServerCertificate=true;";
        String dbUserName="u0583688_vlk";
        String dbPassword="VolkanAntalya159*";
        String query="SELECT * FROM EmployeesEren";

        Connection connection=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(query);
        System.out.println("connetcion is success");
    }
}
