package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.

        Connection connection = DriverManager.getConnection(url, user, password);// bağlantı sağlandı.

        Statement statement = connection.createStatement(); // sorgularımı çalıştırabilmek için bir yol oluştur.

        ResultSet rs = statement.executeQuery("select * from actor");
        //fakat performans icin butun sonuclar rs ye aktarilmiyor
        //biz komut verdikce satir satir gelecek

        //1. satir
        rs.next(); //gostergeyi sonraki adima getir,orada satir varsa butun satiri rs ye at

        String firstName=rs.getString("first_name");
        String lastName=rs.getString(3);//kolonun indexini de verebiliriz(1 ilk olan)
        System.out.println(firstName+" "+lastName);

        //2. satir
        rs.next(); //gostergeyi sonraki adima getir,orada satir varsa butun satiri rs ye at

        firstName=rs.getString("first_name");
        lastName=rs.getString("last_name");//kolonun indexini de verebiliriz(1 ilk olan)
        System.out.println(firstName+" "+lastName);

        connection.close();

    }


}
