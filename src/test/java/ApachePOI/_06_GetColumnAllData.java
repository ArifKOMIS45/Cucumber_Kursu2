package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.Scanner;

public class _06_GetColumnAllData {
    /**
     * LoginData.xlsx i kullanarak, istneilen kolondaki bilgileri
     * ekrana yazdıran programı metod kullanarak yazdırınız.metod kolon numarası alsın.
     *  * src/test/java/ApachePOI/resources/LoginData.xlsx
     */

    public static void main(String[] args) {
        System.out.print("Istenen Kolon=");
        Scanner oku=new Scanner(System.in);
        int column=oku.nextInt();

        String donenSonuc=bul(column);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String bul(int column)
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
            int cellCount=row.getPhysicalNumberOfCells(); // 2 verdiğinde hücrelerin indexi 0 ve 1 olabilir

            if (cellCount > column)
             donecek+= row.getCell(column)+" ";
        }
        return donecek;
    }




}
