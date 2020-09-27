package com.techproed.excelautomation;

import com.aventstack.extentreports.gherkin.model.And;
import com.techproed.utilities.ConfigurationReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {


    @Test
    public void test02() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(ConfigurationReader.getProperty("excel_path"));

        Workbook workbook = WorkbookFactory.create(fileInputStream);

    //Dosya uzerinde yazma islemi gerceklestirmemiz icin buraya FileOutPutStream class'indan bir nesne olusturmamiz gerekiyor.

    FileOutputStream fileOutputStream = new FileOutputStream(ConfigurationReader.getProperty("excel_path"));




    //1. satirin (0. index'in) 4. sutunu'na (3.index'ine) "NUFUS" yazisini yazalim:
    workbook.getSheetAt(0).getRow(0).createCell(3).setCellValue("NUFUS");



    //Almanya'nin nufusunu yazdiralim (Almanya 2. satirda)
    workbook.getSheetAt(0).getRow(1).createCell(3).setCellValue("83 Milyon");



    //Yunanistan'in nufusunu yazdiralim (Yunanistan 3. satirda)
    workbook.getSheetAt(0).getRow(2).createCell(3).setCellValue("11 Milyon");



    //Hucre silmek icin once silmek istedigimiz hucreyi buluyoruz:
    Cell silmekistedigimizhucre = workbook.getSheetAt(0).getRow(7).getCell(2);
    workbook.getSheetAt(0).getRow(7).removeCell(silmekistedigimizhucre);




    //Satiri tamamen silmek icin once silmek istedigimiz satiri buluyoruz:
    Row silmekistedigimizsatir = workbook.getSheetAt(0).getRow(3);
    workbook.getSheetAt(0).removeRow(silmekistedigimizsatir);



        workbook.write(fileOutputStream);







        fileInputStream.close();
        workbook.close();









    }


}
