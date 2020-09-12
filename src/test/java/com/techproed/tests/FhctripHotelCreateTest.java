package com.techproed.tests;

import com.techproed.pages.FhctripHotelCreatePage;
import com.techproed.utulities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhctripHotelCreateTest extends TestBase {

    @Test
    public void FhctripHotelCreateTest01(){

        FhctripHotelCreatePage fhctripHotelCreatePage = new FhctripHotelCreatePage(driver);
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);

        fhctripHotelCreatePage.code.sendKeys("101");
        fhctripHotelCreatePage.adress.sendKeys("Frankfurt");
        fhctripHotelCreatePage.email.sendKeys("ahmttrk45@outlook.com");
        fhctripHotelCreatePage.name.sendKeys("Ahmet TURK");
        fhctripHotelCreatePage.phone.sendKeys("0123456789");
        fhctripHotelCreatePage.idGroup.click();
        Select select = new Select(fhctripHotelCreatePage.idGroup);
        select.selectByIndex(1);
        fhctripHotelCreatePage.submit.click();





    }












}
