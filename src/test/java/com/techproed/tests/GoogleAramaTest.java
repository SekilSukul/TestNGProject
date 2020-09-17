package com.techproed.tests;

import com.techproed.pages.GoogleAramaPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class GoogleAramaTest extends TestBaseFinal {


    @Test
    public void  aramaTesti(){

        extentTest = extentReports.createTest("Google Arama", "Google'da Techproeducation aramasi yaptik");

        extentTest.info("sayfa adresine git");
        Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));

        extentTest.info("webelementleri kullanabilmek icin nesne olustur");
        GoogleAramaPage googleAramaPage = new GoogleAramaPage();

        extentTest.info("arama kutusuna 'techproeducation' yazisini gonder");
        googleAramaPage.searchBox.sendKeys("techproeducation" + Keys.ENTER);


        extentTest.info("4 saniye bekle");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        extentTest.info("tum linkleri karsilastir");
        boolean linkIsExist = false;
        for (WebElement w: googleAramaPage.tumlinkler){
            if (w.getText().contains("techproeducation.com")){
                linkIsExist = true;
                break;
            }
        }


        extentTest.info("assert islemi yap");
        Assert.assertTrue(linkIsExist);
        extentTest.pass("Testimiz PASSED");






    }















}



