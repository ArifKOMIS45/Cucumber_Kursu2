package ApachiPOI;

import org.apache.poi.ss.usermodel.Cell;
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

public class SelfWorking2 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sayfa1");

        Row row = sheet.createRow(0);
        Cell cell;

        int sayac = 1;
        int b=0;
        int a=0;
        while (sayac < 11) {

            for (int i = 1; i < 11; i++) {
                if(row.getRowNum()<11){row = sheet.createRow(b);}
               if (row.getRowNum()>=10){row= sheet.getRow(i-1);}
                cell = row.createCell(a);
                cell.setCellValue(i);
                cell = row.createCell(a+1);
                cell.setCellValue("X");
                cell = row.createCell(a+2);
                cell.setCellValue(sayac);
                cell = row.createCell(a+3);
                cell.setCellValue("=");
                cell = row.createCell(a+4);
                cell.setCellValue(sayac * i);
               b++;
            }
           a=a+6;
            sayac++;
        }
        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachiPOI/resourse/carpimTablosu2.xlsx");
        workbook.write(outputStream);
        workbook.close();//hafizayi bosalttik
        outputStream.close();//dosyayi kapattik

    }

}
