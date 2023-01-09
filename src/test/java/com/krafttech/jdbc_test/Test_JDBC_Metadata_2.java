package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Metadata_2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.brand";

        try (Connection connection= DriverManager.getConnection(url,userName,password);
             Statement  statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet  resultSet = statement.executeQuery(query);)
        {
            ResultSetMetaData metaData = resultSet.getMetaData();
           // System.out.println("getColumnCount() = " + metaData.getColumnCount());

//            resultSet.next();
//            System.out.println("resultSet.getString(metaData.getColumnCount()) = " + resultSet.getString(metaData.getColumnCount()));
            /**
             * Soru: Columncount u kullanarak ilk satırın değerlerini ekrana yazdıralım

            int kolonSayisi=metaData.getColumnCount();
            resultSet.next();
            for (int i = 1; i <=kolonSayisi ; i++) {
                System.out.println("1. row: "+i+". kolon: "+resultSet.getString(i));
            }
             */

            /**
             * SORU: columnCount u kullanarak bütün rowları alt alta yazdıralım

            int kolonSayisi= metaData.getColumnCount();
            while (resultSet.next()){
                for (int i = 1; i <=kolonSayisi ; i++) {
                    System.out.print(resultSet.getString(i)+"\t");
                }
                System.out.println("");
            }*/

            /**
             * SORU: Tablomuzu kolon isimleriyle (başlıklarıyla) beraber columnCount u
             * kullanarak bütün rowları alt alta yazdıralım
             */
            int kolonSayisi=metaData.getColumnCount();
            //1. yol başlık için: System.out.println(metaData.getColumnName(1)+"\t"+metaData.getColumnName(2));
            //2. yol başlık için: ama 1. yolun ilk başlığı yazılmalı yineSystem.out.println(metaData.getColumnName(2));
            //3. yol başlık için:
            for (int i = 1; i <=kolonSayisi ; i++) {
                System.out.print(metaData.getColumnName(i)+"\t");
            }
            System.out.println("");

            while (resultSet.next()){

                 for (int i = 1; i <= kolonSayisi; i++) {
                        System.out.print(resultSet.getString(i)+ "\t"+"\t"+"\t");
                    }
                System.out.println(" ");
                }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
