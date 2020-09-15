package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {


    @Test
    public void fileIsExist(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));


        String userFilePath = System.getProperty("user.dir");

        String pomXmlFilePath = userFilePath + "/pom.xml";

        boolean isExist = Files.exists(Paths.get(pomXmlFilePath));
        System.out.println(isExist);

        Assert.assertTrue(isExist);






    }

    @Test
    public void fileUpload(){

    driver.get("http://the-internet.herokuapp.com/upload");


        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\ahmtt\\OneDrive\\Masaüstü\\Calismalar\\logo.png");



        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();

        WebElement fileUpload = driver.findElement(By.xpath("//h3"));
        System.out.println(fileUpload);
        Assert.assertTrue(fileUpload.isDisplayed());



    }

    @Test
    public void fileDownload(){

        driver.get("http://the-internet.herokuapp.com/download");

        //C:\Users\ahmtt\Downloads.Amsterdam.jpg

        WebElement amsterdam = driver.findElement(By.partialLinkText("Amsterdam.jpg"));
        amsterdam.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean isExist = Files.exists(Paths.get("C:\\Users\\ahmtt\\Downloads\\Amsterdam.jpg"));
        Assert.assertTrue(isExist);


    }































}
