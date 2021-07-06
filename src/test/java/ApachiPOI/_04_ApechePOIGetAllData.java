package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApechePOIGetAllData {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachiPOI/resourse/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        //calisma sayfasindaki toplam satir sayisini veriyor
        int rowCount=sheet.getPhysicalNumberOfRows();


        for (int i = 0; i < rowCount ; i++) {
            Row row= sheet.getRow(i);//1. satir alindi
            //Bu satirdaki toplam hucre sayisi alindi
            int cellCount=row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount ; j++) {//1. satirdaki hucre sayisi kadar donecek
                Cell cell= row.getCell(j);//bu siradaki hucreyi alsim

                System.out.print(cell+" ");

            }System.out.println();
        }











    }


}
