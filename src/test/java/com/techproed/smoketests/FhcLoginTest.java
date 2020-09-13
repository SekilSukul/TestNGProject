package com.techproed.smoketests;

import com.techproed.pages.FhctripLoginPage;
import com.techproed.utulities.ConfigurationReader;
import com.techproed.utulities.TestBase;
import org.testng.annotations.Test;

public class FhcLoginTest extends TestBase {


    @Test
    public void fhcLoginTest01 (){


        FhctripLoginPage fhctripLoginPage = new FhctripLoginPage(driver);

        driver.get(ConfigurationReader.getProperty("fhc_url"));

        fhctripLoginPage.login.sendKeys(ConfigurationReader.getProperty("username"));
        fhctripLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        fhctripLoginPage.loginButton.click();



    }


}
