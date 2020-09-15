package com.techproed.smoketests;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GlbSignUpTest {


    @Test
    public void Test01(){

      Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));

      GlbSignUpPage glbSignUpPage = new GlbSignUpPage();

      glbSignUpPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("glb_email"));
      glbSignUpPage.mobileKutusu.sendKeys(ConfigurationReader.getProperty("glb_phone"));
      glbSignUpPage.nameKutusu.sendKeys(ConfigurationReader.getProperty("glb_name"));
      glbSignUpPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty("glb_password"));
      glbSignUpPage.rePasswordKutusu.sendKeys(ConfigurationReader.getProperty("glb_repassword"));



      glbSignUpPage.signUpbutonu.click();




      Assert.assertTrue(glbSignUpPage.successYazisi.isDisplayed());

      System.out.println(glbSignUpPage.successYazisi.getText());


    }





    @AfterClass
    public void tearDown(){

        Driver.closeDriver();

    }





}
