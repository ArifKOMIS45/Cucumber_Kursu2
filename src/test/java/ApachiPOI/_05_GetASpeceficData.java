package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

public class _05_GetASpeceficData {
    public static void main(String[] args)  {

        Scanner oku = new Scanner(System.in);
        System.out.print("Aradiginiz kelimeyi girin= ");
        String kelime = oku.nextLine();

        String donensonuc = Bul(kelime);
        System.out.println("donensonuc = " + donensonuc);

    }

    public static String Bul(String ArananKelime)  {

        String path = "src/test/java/ApachiPOI/resourse/LoginData.xlsx";
        Workbook workbook=null;
        try {
           FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
       }catch (Exception ex){
            System.out.println("ex = " + ex);
                   }

        Sheet sheet = workbook.getSheetAt(0);

        String donecek="";

        int rowcount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowcount ; i++) {
            Row row=sheet.getRow(i);
            if (row.getCell(0).toString().equalsIgnoreCase(ArananKelime))
            {//yandaki hucrelerin hepsini ekleyip tek bir stringe donusturecegiz
                int cellCount=row.getPhysicalNumberOfCells();
                for (int j = 1; j <cellCount ; j++) {
                    donecek+=row.getCell(j)+" ";
                }

            }




        }



        return donecek;


    }


}
