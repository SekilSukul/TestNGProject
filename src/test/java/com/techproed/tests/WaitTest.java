package com.techproed.tests;

import com.techproed.utulities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTest extends TestBase {


    @Test
    public void implicitlyWait(){

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement removeButonu = driver.findElement(By.xpath("//*[.='Remove']"));
        removeButonu.click();

        WebElement element = driver.findElement(By.xpath("//*[.='Add']"));






    }

    @Test
    public void explictlyWait(){

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        //Explicit Wait kullanmak için, WebDriverWait class'ından nesne üretmek zorundayız.
        WebDriverWait wait = new WebDriverWait(driver,30);


        WebElement removeButonu = driver.findElement(By.xpath("//*[.='Remove']"));
        removeButonu.click();


        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println(message.getText());






    }



















}