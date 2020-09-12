package com.techproed.tests;

import com.techproed.pages.FhctripLoginPage;
import com.techproed.utulities.TestBase;
import org.testng.annotations.Test;

public class FhctripTest extends TestBase {



    @Test
    public void fhcTripTest01(){

        FhctripLoginPage fhctripLoginPage = new FhctripLoginPage(driver);
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");

        fhctripLoginPage.login.sendKeys("manager2");
        fhctripLoginPage.password.sendKeys("Man1ager2!");
        fhctripLoginPage.loginButton.click();

    }









}
