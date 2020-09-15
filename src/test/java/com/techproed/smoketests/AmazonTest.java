package com.techproed.smoketests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {




    @Test
    public void amazonTest01(){

        AmazonPage amazonPage = new AmazonPage(driver);

        driver.get(ConfigurationReader.getProperty("amazon_url"));

       amazonPage.helloSignIn.click();

        amazonPage.signIn.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        amazonPage.emailBox.sendKeys(ConfigurationReader.getProperty("amazon_email"));










    }





}
