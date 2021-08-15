package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    protected static Statement statement;
    private static Connection connection;

    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static List<List<String>> getDataList(String query) {
        DBConnectionOpen();
        List<List<String>> returnList = new ArrayList<>();
        try {

            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (rs.next()) {
                List<String> rowList = new ArrayList<>();

                for (int j = 1; j <= columnCount; j++) {
                    rowList.add(rs.getString(j));
                }
                returnList.add(rowList);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        DBConnectionClose();
        return returnList;
    }

    public static void main(String[] args) {
        List<List<String>> data = getDataList("select * from city");
        for (List<String> a : data) {
            System.out.println(a);
        }


    }
}
