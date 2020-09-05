package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @Test
    public void jsalertTest(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();


    String alertMesaji = driver.switchTo().alert().getText(); //Sayfadaki bir alert'e gecis methodu. getText ise alert'in icerdigi mesaji alir.
    System.out.println(alertMesaji);

    driver.switchTo().alert().accept(); //Alert'in icerisindeki "ok" butonuna tiklamak icin kullanilir.

    }


    @Test
    public void JSConfirmTest(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmButton.click();

        String confirmButtonMesaj = driver.switchTo().alert().getText();
        System.out.println(confirmButtonMesaj);

        driver.switchTo().alert().dismiss(); //Dismiss methodu alertin icerisindeki cancel butonuna tiklar


    }

    @Test
    public void JSPromptTest(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptButton.click();

        String promptButtonMesaj = driver.switchTo().alert().getText();
        System.out.println(promptButtonMesaj);

        driver.switchTo().alert().sendKeys("Merhaba TestNG"); //Prompt Alert'e mesaj gondermeye yarar


        driver.switchTo().alert().accept();




    }




}
