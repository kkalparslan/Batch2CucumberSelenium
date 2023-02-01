package com.krafttech.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Utilities {
    static String url = "jdbc:sqlserver://94.73.150.3:1433;DatabaseName=u0583688_vlk;" +
            "encrypt=true;trustServerCertificate=true;";
    static String userName = "u0583688_vlk";
    static String password = "VolkanAntalya159*";
    static String query = "select * from u0583688_vlk.dbo.regions";
    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    static ResultSetMetaData resultSetMetaData;

    public static void main(String[] args) {
        connectJdbc();
        runQuery();
        getRowCount();
        getResultSetMetadata();
        getColumnCount();
        getAllColumnNameAsList();
        getRowDataAsList(1);

        closeJDBC();

    }

    public static void connectJdbc() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            System.out.println("Connection FAILED");
            e.getMessage();
        }
    }

    public static ResultSet runQuery() {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);
            System.out.println("resultSet get result from DB");
        } catch (SQLException e) {
            System.out.println("resultSet failed");
            e.getMessage();
        }
        return resultSet;
    }

    public static void closeJDBC() {
        try {
            if (resultSet != null) {
                resultSet.close();
                System.out.println("resultSet closed");
            }
            if (statement != null) {
                statement.close();
                System.out.println("statement closed");
            }
            if (connection != null) {
                connection.close();
                System.out.println("connection closed");
            }

        } catch (SQLException e) {
            System.out.println("closeJDBC failed");
            e.getMessage();
        }
    }

    /**
     * to learn table row number
     */
    public static int getRowCount() {
        int row = 0;
        try {
            resultSet.last();
            row = resultSet.getRow();
            System.out.println("row number: " + row);
            resultSet.beforeFirst();
        } catch (SQLException e) {
            System.out.println("row count can not get");
            e.getMessage();
        }
        return row;
    }

    /**
     * to learn table column number
     */
    public static int getColumnCount() {
        int columnCount = 0;
        try {
            columnCount = resultSetMetaData.getColumnCount();
            // System.out.println("columnCount = " + columnCount);
        } catch (SQLException e) {
            System.out.println("metadata is not got");
            e.getMessage();
        }
        return columnCount;
    }

    public static ResultSetMetaData getResultSetMetadata() {
        try {
            resultSetMetaData = resultSet.getMetaData();
            System.out.println("metadata is got");
        } catch (SQLException e) {
            System.out.println("metadata is not got");
            e.getMessage();
        }
        return resultSetMetaData;
    }

    /**
     * to learn all column name
     */
    public static List<String> getAllColumnNameAsList() {
        List<String> columnNameList = new ArrayList<>();
        try {
            for (int i = 1; i <= getColumnCount(); i++) {
                //System.out.println("kolon"+i+": "+resultSetMetaData.getColumnName(i));
                columnNameList.add(resultSetMetaData.getColumnName(i));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("columnNameList = " + columnNameList);
        return columnNameList;
    }

    /**
     * row number for parameter and return list with row's data
     */
    public static List<String> getRowDataAsList(int rowNumber) {
        List<String> rowDataList = new ArrayList<>();
        try {
            resultSet.absolute(rowNumber);
            for (int i = 1; i <= getColumnCount(); i++) {
                String cell = resultSet.getString(i);
                rowDataList.add(cell);
            }
        } catch (SQLException e) {
            System.out.println("getRowDataAsList is failed");
        }
        for (String str : rowDataList) {
            System.out.print(str + "\t");
        }
        System.out.println(" ");
        return rowDataList;
    }

    /**
     * row number for parameter and return list with row's data
     */
    public static String getCellData(int rowNumber, int columnIndex) {
        String cellData = "";
        try {
            resultSet.absolute(rowNumber);
            cellData = resultSet.getString(columnIndex);
            resultSet.beforeFirst();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cellData;
    }

    /**
     * row number for parameter and return list with row's data
     */
    public static String getCellData(int rowNumber, String columnLabel) {
        String cellData = "";
        try {
            resultSet.absolute(rowNumber);
            cellData = resultSet.getString(columnLabel);
            resultSet.beforeFirst();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cellData;
    }


}

