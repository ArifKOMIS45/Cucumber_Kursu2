package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _04_Example extends _JDBCParent {
    // film tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
    // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.

    @Test
    public void test3_1() throws SQLException {
        WritingTable("film", "*");

    }

    public void WritingTable(String tableName, String istenilenAlan) throws SQLException {
        ResultSet rs = statement.executeQuery("select " + istenilenAlan + " from" + " " + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {

            System.out.printf("%-30s", rsmd.getColumnName(i) + " ");
        }
        System.out.println();
        while (rs.next()) {
            for (int j = 1; j <= columnCount; j++) {
                System.out.printf("%-30s", rs.getString(j) + " ");
            }
            System.out.println();

        }


    }
    @Test
    @Parameters({"TableName","IstenilenAlan"})
    public void test3(String tableName, String istenilenAlan) throws SQLException {
        WritingTable(tableName, istenilenAlan);
    }


    }

