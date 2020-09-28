package com.techproed.tests;

import com.techproed.pages.AmazonNewPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test (dataProvider = "urunler")
    public void amazonAramaTest(String kelime){

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));


        AmazonNewPage amazonNewPage = new AmazonNewPage();

        amazonNewPage.aramaKutusu.sendKeys(kelime + Keys.ENTER);

    }

    @DataProvider (name = "urunler")
    public Object[] getuUrunler(){
      Object[]  urunler = new Object[4];
      urunler[0] = "tv";
      urunler[1] = "asus";
      urunler[2] = "mouse";
      urunler[3] = "keyboard";

      return urunler;


    }













}
