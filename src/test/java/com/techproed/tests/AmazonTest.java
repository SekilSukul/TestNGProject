package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utulities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {

    @Test
    public void amazonTest (){
        driver.get("http://amazon.com");
        AmazonPage amazonPage = new AmazonPage(driver);

        amazonPage.amazonSearchBox.sendKeys("Printer" + Keys.ENTER);


    }
















}
