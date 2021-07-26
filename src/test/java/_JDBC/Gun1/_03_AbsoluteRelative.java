package _JDBC.Gun1;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends _JDBCParent {
    @Test
    private void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from film");

        rs.absolute(10);//10. satira git
        String  title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15);//sondan 15. satira git
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(5);// en son bulundugun yerden 5 ileri gider..
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5);// en son bulundugun yerden 5 geri gider..
        title=rs.getString("title");
        System.out.println("title = " + title);

    }









}
