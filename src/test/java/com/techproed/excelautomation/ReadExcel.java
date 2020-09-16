package com.techproed.excelautomation;

import com.techproed.utilities.ConfigurationReader;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {


    @Test
     public void test01() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(ConfigurationReader.getProperty("excel_path"));

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Row birincisatir = sheet.getRow(0);

        Cell ulkeler = birincisatir.getCell(0);
        Cell baskentler = birincisatir.getCell(1);
        Cell nesiMeshur = birincisatir.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(nesiMeshur);


        System.out.println(workbook.getSheetAt(0).getRow(2).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        //Satir (row) sayisini almak icin: (index 0'dan basliyor)
        int satirSayisi = workbook.getSheetAt(0).getLastRowNum();
        System.out.println(satirSayisi);


        //icerisinde veri bulunan satir sayisini almak icin (bos satirlarin sayilmadigi) (index 1'den baslyiyor)
        int doluSatirSayisi = workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println(doluSatirSayisi);



        //Tum ulkeleri yazdirmak icin:

        int sonSatirIndexi = workbook.getSheetAt(0).getLastRowNum();

        for (int i = 0; i<=sonSatirIndexi; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));

        }





        //Tum baskentleri yazdirmak icin:

        sonSatirIndexi=workbook.getSheetAt(0).getLastRowNum();

        for (int i = 0; i<=sonSatirIndexi; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
        }



        //Bir satirin son sutunun index'ini alma: (1den basliyor)

        int sonSutunIndex = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println(sonSutunIndex);


        for(int k=0; k<sonSutunIndex; k++){
            System.out.print(workbook.getSheetAt(0).getRow(3).getCell(k));

        }














    }



}
