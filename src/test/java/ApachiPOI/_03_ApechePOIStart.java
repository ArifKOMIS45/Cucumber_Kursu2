package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApechePOIStart {
    public static void main(String[] args) throws IOException {
       //Excel okuma
        //dosya yolu alindi
        String path = "src/test/java/ApachiPOI/resourse/ApacheExcel2.xlsx";

        //Dosya okma islemcisine dosyanin yolunu veriyoruz
        FileInputStream dosyaOkumaIslemcisi = new FileInputStream(path);

        //Dosya okuma islemcisi uzerinden calismakitabi aliyorum
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaIslemcisi);

        //istedigiim isimdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");
       //Sheet calismaSayfasi=calismaKitabi.getSheet("0");

        //istenilen satiri aliyorum
        Row satir=calismaSayfasi.getRow(0);

        Cell hucre=satir.getCell(0);

        System.out.println("hucre = " +hucre);










    }


}
