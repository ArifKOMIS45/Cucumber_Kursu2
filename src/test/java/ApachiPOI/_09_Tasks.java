package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
        /*  Soru 1:
        *  Çarpım tablosunu excele yazdırınız.
        *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
        *  sıfırdan excel oluşturarak.
        *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
        */

        /*  Soru 2:
        *  Çarpım tablosunu excele yazdırınız.
        *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
        *  sıfırdan excel oluşturarak.
        *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
        */

public class _09_Tasks {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("sayfa1");

        Row row=sheet.createRow(0);
        Cell cell= row.createCell(0);
        cell.setCellValue("merhabe dunya biz geldik");

        for (int i = 1; i <10 ; i++) {
            row=sheet.createRow(i);
            cell= row.createCell(0);
            cell.setCellValue(i);
        }

        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachiPOI/resourse/carpimTablosu1.xlsx");
        workbook.write(outputStream);
        workbook.close();//hafizayi bosalttik
        outputStream.close();//dosyayi kapattik

    }
}
