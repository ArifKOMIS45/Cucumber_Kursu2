package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        // hafızada  yeni workbook oluştur, sonra sheet oluştur, sonra row oluştur, sonra cell oluştur.
        XSSFWorkbook workbook=new XSSFWorkbook();// hazfızada workbook oluştur.
        XSSFSheet sheet=workbook.createSheet("Sayfa1");// hazıfazda sheet oluştur

        Row row=sheet.createRow(0);// satır oluştur
        Cell cell=row.createCell(0);// hucre oluştur
        cell.setCellValue("Merhaba dünya biz geliyoruz");// hucreye hafızada yaz.

        //Alt alta 1 den 9 a kadar raka yazdırmak istiyoruz
        for(int i=1;i<10;i++)
        {
            row=sheet.createRow(i);// satır oluştur
            cell=row.createCell(0);// hucre oluştur
            cell.setCellValue(i);// hucreye hafızada yaz.
        }

        // dosyayı oluşturduk.
        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachePOI/resources/yeniExcel.xlsx");
        workbook.write(outputStream);// içine hafızadaki bilgileri yazdık.
        workbook.close(); // hafızayı boşalttık
        outputStream.close();// dosyayı kapattık.
    }
}
