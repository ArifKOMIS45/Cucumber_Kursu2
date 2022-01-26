package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetASpecificData {

    public static void main(String[] args) {
        System.out.print("Aranacak Kelime=");
        Scanner oku=new Scanner(System.in);
        String arananKelime=oku.nextLine();

        String donenSonuc=bul(arananKelime);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String bul(String arananKelime)
    {
        String path="src/test/java/ApachePOI/resources/LoginData.xlsx";
        String donecek="";

        Workbook workbook=null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        }
        catch (Exception ex)
        {
        }

        Sheet sheet=workbook.getSheetAt(0);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for(int i=0;i< rowCount;i++)
        {
            Row row=sheet.getRow(i);

            //aradığım kelime 1.hücrede var mı ; her satırın 1.hücresini kontrol ettim
            if (row.getCell(0).toString().equalsIgnoreCase(arananKelime))
            {
                // yandaki hücrelerin hepsini ekleyip tek bir stringe dönüştürücem
                int cellCount= row.getPhysicalNumberOfCells();

                for(int j=1;j<cellCount;j++)
                {
                    donecek+=row.getCell(j);
                }
            }
        }
        return donecek;
    }


}
