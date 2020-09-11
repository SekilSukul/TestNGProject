package com.techproed.tests;

import com.techproed.utulities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends TestBase {



    public void giris(){

        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);


    }


    @Test
    public void table(){

        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());

        List<WebElement> basliklar = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement baslik : basliklar){
            System.out.println(baslik.getText());

        }





    }









    @Test
    public void satirlar(){
        giris();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        List <WebElement> satirlar = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement satir: satirlar){
            System.out.println(satir.getText());

        }


    }


    @Test
    public void tumHucreler(){
        giris();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    List<WebElement> tumHucreler = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement hucre: tumHucreler){
            System.out.println(hucre.getText());

        }





    }



    @Test
    public void sutunYazdirma(){



            giris();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




         List<WebElement> dorduncuSutun = driver.findElements(By.xpath(" //tbody/tr/td[4]"));

            for(WebElement  sutundort : dorduncuSutun){
                System.out.println(sutundort.getText());
            }









    }



    @Test
    public void belirliBirHucre (){
        giris();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement cell = driver.findElement(By.xpath("//tbody/tr[3]/td[6]"));
        System.out.println(cell.getText());







    }






    public void hucreYazdirma (int satir, int sutun){

        String xpath =  "//tbody/tr["+   satir   +" ]/td["+    sutun    +" ]";
        WebElement hucre = driver.findElement(By.xpath(xpath));
        System.out.println(hucre.getText());



    }



    @Test
    public void dinamikHucreBulma (){
        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        hucreYazdirma(3,5);
        hucreYazdirma(4,6);
        hucreYazdirma(1,2);
        hucreYazdirma(2,9);





    }















}
