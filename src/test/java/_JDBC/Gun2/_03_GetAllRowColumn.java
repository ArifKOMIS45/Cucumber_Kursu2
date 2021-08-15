package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends _JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            String columnType = rsmd.getColumnTypeName(i);
            System.out.println(columnName + "  " + columnType);

        }
    }

    @Test
    public void test2() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {

            System.out.print(rsmd.getColumnName(i) + " ");

        }
        System.out.println();
        while (rs.next()) {
            for (int j = 1; j <= columnCount; j++) {
                System.out.print(rs.getString(j) + " ");
            }
            System.out.println();

        }
    }

    @Test
    public void test2_2() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {

            System.out.printf("%-25s", rsmd.getColumnName(i) + " ");

        }
        System.out.println();
        while (rs.next()) {
            for (int j = 1; j <= columnCount; j++) {
                System.out.printf("%-25s", rs.getString(j) + " ");
            }
            System.out.println();

        }
    }


    @Test
    public void test3() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        rs.last();
        int all = rs.getRow();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print("");
            System.out.print(rsmd.getColumnName(i));
            System.out.println();
            rs.first();
            for (int j =0 ; j < all; j++) {
                System.out.println(rs.getString(i));
                rs.next();
            }

        }

    }


}


