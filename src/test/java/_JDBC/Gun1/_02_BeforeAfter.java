package _JDBC.Gun1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {
   private Statement statement;
   private Connection connection;
    @BeforeTest
    private void beforeTest() throws SQLException {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.

         connection = DriverManager.getConnection(url, user, password);// bağlantı sağlandı.

         statement = connection.createStatement(); // sorgularımı çalıştırabilmek için bir yol oluştur.

    }
    @AfterTest
    private void afterTest() throws SQLException {
        connection.close();
    }




    @Test
    private void test1() throws SQLException {
      ResultSet rs= statement.executeQuery("select * from language");
       rs.next();
       String  dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);
    }

    @Test
    private void test2() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");
        rs.next();
        String  dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);
    }


    @Test
    private void test3() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");
        rs.next();//English
        String  dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();//italian
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.previous();//bir onceki English
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);
    }













}
