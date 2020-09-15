package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrnekAmazonKayitSayfasi extends TestBase {

    @Test
    public void test00(){
        driver.get("http://amazon.com");

        WebElement signInbutonu = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(signInbutonu).perform();


        WebElement startHere = driver.findElement(By.xpath("//*[.='Sign in']"));
        startHere.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("ap_email")).sendKeys("selamlar");
    }

    @Test
    public void test01(){
        driver.get("http://amazon.com");

        WebElement signInbutonu = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(signInbutonu).perform();


        WebElement startHere = driver.findElement(By.partialLinkText("Start here."));
        startHere.click();

        String title = driver.getTitle();
        Assert.assertEquals("Amazon Registration",title);


    }


    @Test
    public void test02(){
        driver.get("http://amazon.com");

        WebElement signInbutonu = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(signInbutonu).perform();


        WebElement startHere = driver.findElement(By.partialLinkText("Start here."));
        startHere.click();

        WebElement nameBox = driver.findElement(By.id("ap_customer_name"));
        nameBox.sendKeys("Ahmet TURK");

        WebElement emailBox = driver.findElement(By.id("ap_email"));
        emailBox.sendKeys("ahmttrk45@outlook.com");

        WebElement passwordBox = driver.findElement(By.id("ap_password"));
        passwordBox.sendKeys("Ahmet1234!");


        WebElement passwordCheck = driver.findElement(By.id("ap_password_check"));
        passwordCheck.sendKeys("Ahmet1234!");

        WebElement button = driver.findElement(By.id("a-autoid-0"));
        //button.click();







    }















}




