package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Day2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.brand";

        try {
            Connection connection= DriverManager.getConnection(url, userName, password);
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet=statement.executeQuery(query);
            /**
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.next();
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.previous();
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.last(); // burdan sonra bir kere daha next() komutu çağırılıp yazdırılırsa exception veriyor.
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.first();
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.beforeFirst(); // before First() metodu ilk row da ilen yapılırsa yazdırınca yine exception atıyor
            System.out.println("resultSet.getString(2) = " + resultSet.getString(2));
            resultSet.absolute(5); // absolute methodu ile istediğimiz row u yazdırabiliyoruz.
            System.out.println("absolute (5)= " + resultSet.getString(2));
            resultSet.afterLast();// bu method da son rowun dışına çıkıyor.
            resultSet.beforeFirst();

             SORU: tüm rowların ilk iki kolonunu alt alta yazdırılacak.

            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" || "+resultSet.getString(2));
                }
           // resultSet.next();
           // System.out.println("getRow(no) = " + resultSet.getRow());

             SORU: resultSet li iki kod kullanarak toplam row sayısını bulunuz..
             1. YÖNTEN:
            while (resultSet.next()){
                System.out.println(resultSet.getRow());
            }
             */
            /**
             * 2. YÖNTEM:

            resultSet.last();
            System.out.println(resultSet.getRow());
             */

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
