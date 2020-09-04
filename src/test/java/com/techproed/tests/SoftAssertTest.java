package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {


    WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

   // @AfterClass
    public void tearDown(){

        driver.quit();

    }



    @Test
    public void  Test01 (){

        SoftAssert softAssert = new SoftAssert();
        driver.get("http://a.testaddressbook.com/sign_in");






        WebElement emailBox = driver.findElement(By.id("session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");








        WebElement passwordBox = driver.findElement(By.id("session_password"));
        passwordBox.sendKeys("Test1234!");
        passwordBox.submit();





       WebElement singOut = driver.findElement(By.partialLinkText("Sign out"));
       softAssert.assertTrue(singOut.isDisplayed());


        softAssert.assertAll();







    }























}
