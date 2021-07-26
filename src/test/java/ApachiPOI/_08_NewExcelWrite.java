package ApachiPOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //hafizada yeni workbook olustur,sonra sheet,sonra row.sonra cell olustur
        XSSFWorkbook workbook=new XSSFWorkbook();//hafizada workbook olustur.
        XSSFSheet sheet=workbook.createSheet("sayfa1");

        Row row=sheet.createRow(0);
        Cell cell= row.createCell(0);
        cell.setCellValue("merhabe dunya biz geldik");

        for (int i = 1; i <10 ; i++) {
             row=sheet.createRow(i);
             cell= row.createCell(0);
            cell.setCellValue(i);
        }

        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachiPOI/resourse/ExcelYeni.xlsx");
        workbook.write(outputStream);
        workbook.close();//hafizayi bosalttik
        outputStream.close();//dosyayi kapattik

    }
}
