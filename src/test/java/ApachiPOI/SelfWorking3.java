package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelfWorking3 {
    public static void main(String[] args)  {

            List<List<String>> returnList = new ArrayList<>();

            Workbook workbook = null;
            try {
                FileInputStream inputStream = new FileInputStream("src/test/java/ApachiPOI/resourse/yeniExcel.xlsx");
                workbook = WorkbookFactory.create(inputStream);
            } catch (Exception ex) {
            }

            Sheet sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getPhysicalNumberOfRows();

            for (int i = 0; i < rowCount; i++) {

                //her okuna satırdaki hücreler rowList e ekleniyor
                List<String> rowList = new ArrayList<>();
                Row row = sheet.getRow(i);
                for (int j = 0; j < 2; j++) {
                    rowList.add(row.getCell(j).toString());

                }
                returnList.add(rowList);
                // daha sonra rowList 2 boyutlu liste e ekleniyor.

            }


       // System.out.print(returnList);
            returnList.forEach(System.out::println);

    }

}
