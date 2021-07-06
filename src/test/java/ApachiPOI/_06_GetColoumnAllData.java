package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * LoginData.xlsx i kullanarak, istneilen kolondaki bilgileri
 * ekrana yazdıran programı metod kullanarak yazdırınız.metod kolon numarası alsın.
 *  * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _06_GetColoumnAllData {
    public static void main(String[] args)  {

        Scanner oku = new Scanner(System.in);
        System.out.print("Aradiginiz kolon no girin= ");
        int sayi = oku.nextInt();

        String donensonuc = Bul(sayi);
        System.out.println("donensonuc = " + donensonuc);

    }

    public static String Bul(int coloumn) {

        String path = "src/test/java/ApachiPOI/resourse/LoginData.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (Exception ex) {
            System.out.println("ex = " + ex);
        }

        Sheet sheet = workbook.getSheetAt(0);
        String donecek = "";

        int rowcount = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowcount; i++) {
            Row row = sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();
            if (cellCount>coloumn)
            donecek += row.getCell(coloumn) + ",";
        }
        return donecek.substring(0,donecek.length()-1);


    }


}
