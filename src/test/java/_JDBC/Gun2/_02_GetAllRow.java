package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _JDBCParent {

    @Test
    private void Test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer");

        int rowCount = 0;
        while (rs.next()) {
            String ad = rs.getString("first_name");
            String soyad = rs.getString("last_name");
            System.out.println(ad + " " + soyad);
            rowCount++;
        }
        System.out.println("rowCount = " + rowCount);
        rs.getRow();//bu nokta yani satirin olmadigi nokta;
        rs.last();
        System.out.println("last: rs.last() = " + rs.getRow());

    }


    @Test
    private void Test2For() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer");

        rs.last();
        int rowCount = rs.getRow();// toplam row sayisini aldik
        rs.first();// gosterge tekrara basa getirdik

        for (int i = 0; i < rowCount; i++) {

            String ad = rs.getString("first_name");
            String soyad = rs.getString("last_name");
            System.out.println(ad + " " + soyad);
            rs.next();
        }
    }

    @Test
    private void Test2For2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer");

        rs.last();
        int rowCount = rs.getRow();

        for (int i = 0; i <= rowCount; i++) {
            rs.absolute(i);
            String ad = rs.getString("first_name");
            String soyad = rs.getString("last_name");
            System.out.println(ad + " " + soyad);

        }
    }

    @Test
    private void Test2For3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer");

        rs.last();
        int rowCount = rs.getRow();
        for (int i = rowCount; i > 0; i--) {// sondan basa yazdirdik
            rs.absolute(i);
            String ad = rs.getString("first_name");
            String soyad = rs.getString("last_name");
            System.out.println(ad + " " + soyad);

        }
    }

}
