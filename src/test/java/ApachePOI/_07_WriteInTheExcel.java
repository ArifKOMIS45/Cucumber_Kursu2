package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // Var olan bir EXCEL yazma işlemi
        //dosya okuma işlemleri ile sheet e kadar ulaştım
        String path="src/test/java/ApachePOI/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        // HAFIZADA oluşturma ve yazma işlemelri yapılıyor
        Row row=sheet.createRow(0); // Satır açıldı ama kullanılabilir durumda değil
        Cell cell=row.createCell(0); // hücre oluşturuldu A1 kullanılabilir bir hücre var.
        cell.setCellValue("Merhaba Dünya"); // bilgi yazıldı

        for(int i=1;i<10;i++)  // hücrelere yan tana 1 den 9 a kadar her hücreye sayıları yazdırdık
        {
             cell=row.createCell(i);
             cell.setCellValue(i);
        }

        // yazma işlemine geçebilmek için okuma modunu kapatmalıyız.
        inputStream.close(); // okuma modu ve bağlantısı kapatıldı.

        // Yazma işlemi için EXCEL i yazma modunda açıp yazma işlemini yapacağız.
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();
        // yazma işlemi kapatıldı
    }
}
