package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends _JDBCParent {
    // address tablosundaki teki disrict alanını önce 10.satırdakini sonra, 22.satırdaki,
    // sonra en son satırdaki bilgisini yazdırınız.
    @Test
    private void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select district from address");
        rs.absolute(10);
        String district = rs.getString(1);
        System.out.println("district = " + district);

        rs.relative(12);
        district = rs.getString(1);
        System.out.println("district = " + district);

        rs.last();
        district = rs.getString(1);
        System.out.println("district = " + district);
    }
}