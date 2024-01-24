package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Closing {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;" +
                "encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.product";

        Connection connection = null;
        Statement statement  = null;
        ResultSet resultSet  = null;
        /**
         * burada try catch bloğu dışında connectionları initiliaze ettik ve try bloğunda tekrar instantiate yaptık.
         * catch bloğu dışında da finally blok oluturarak üç connection ı null değilse kapat komutu ile kapattık.
         * tabi bu connectionlar try/catch in dışına çıktığı için main methoda SQL EXCEPTİON throws yaptık.
         * Closing_2 sınıfında ise connectionları kapatmak için best practice uygulayarak try bloğu içinde ()
         * parantez içinde sanki try bloğunun parametresi gibi tanımladık ve böylece finally bloğa ihtiyaç duymadan otomatik
         * olarak connectionları kapatabildik.
         */

        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println(resultSet.getString(2));
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        System.out.println("resultSet.next() = " + resultSet.next());// yukarıda finally block içinde connectionlar
        // kapandığı için sout hata verir..
    }
}
