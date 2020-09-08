package com.techproed.tests;

import com.techproed.utulities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrnekHotelOlusturma extends TestBase {



    @BeforeMethod
    public void giris(){

    /*
        http://www.fhctrip-qa.com/admin/HotelAdmin/Create
        a. Username : manager2
        b. Password : Man1ager2!
     */



        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");

        WebElement usernameBox = driver.findElement(By.id("UserName"));
        usernameBox.sendKeys("manager2");

        WebElement passwordBox = driver.findElement(By.id("Password"));
        passwordBox.sendKeys("Man1ager2!");

        passwordBox.submit();



}



    @Test
    public void hotelCreate (){

        WebElement codeBox = driver.findElement(By.id("Code"));
        codeBox.sendKeys("1453");

        WebElement nameBox = driver.findElement(By.id("Name"));
        nameBox.sendKeys("Ahmet TURK");

        WebElement adressBox = driver.findElement(By.id("Address"));
        adressBox.sendKeys("Frankfurt am Main");

        WebElement phoneBox = driver.findElement(By.id("Phone"));
        phoneBox.sendKeys("0123456789");

        WebElement emailBox = driver.findElement(By.id("Email"));
        emailBox.sendKeys("ahmttrk45@gmail.com");

        WebElement idBox = driver.findElement(By.id("IDGroup"));

        Select select = new Select(idBox);
        select.selectByIndex(1);

        WebElement saveButton = driver.findElement(By.id("btnSubmit"));
        saveButton.click();


WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement successfully = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
Assert.assertTrue(successfully.isDisplayed());





        }

















}







