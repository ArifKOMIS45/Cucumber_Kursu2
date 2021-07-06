package ApachiPOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WrittenInTheExcel  {

    public static void main(String[] args) throws IOException {
        //var olan bir exelde yazma islemi
        //dosya okuma islemleri ile sheet e kadar ulastim
        String path = "src/test/java/ApachiPOI/resourse/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        //hafizada olusturma ve yazma islemleri yapiliyor
        Row row=sheet.createRow(0);//satir acildi ama kullanilabilir degil
        Cell cell= row.createCell(0);//hucre olusturuldu A1 hucresi kullanilabilir durumda
        cell.setCellValue("Merhaba Dunya");//bilgi yazildi
       for (int i = 1; i <10 ; i++) {
            cell= row.createCell(i);
            cell.setCellValue(i);
        }
        inputStream.close();//yazma islemi icin okumayi kapatmaliyiz



        //yazma islemi
        FileOutputStream fileOutputStream=new FileOutputStream(path);//okuma icin yer gosterildi
        workbook.write(fileOutputStream);//yazma islemi yapildi
        fileOutputStream.close();//yazma islemi kapatildi

    }


}
