package com.techproed.tests;

import com.techproed.pages.FhcTripLoginNewPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTest1 {

    @Test (dataProvider = "bilgiler")
    public void loginTest(String kullanici, String sifre){
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_url"));


        FhcTripLoginNewPage fhcTripLoginNewPage = new FhcTripLoginNewPage();
        fhcTripLoginNewPage.login.sendKeys(kullanici);
        fhcTripLoginNewPage.password.sendKeys(sifre);
        fhcTripLoginNewPage.loginButton.click();

    }

    @DataProvider(name = "bilgiler")
    public Object[][] getBilgiler(){

        Object[][] array = new Object[3][2];
        array[0][0] = "manage";
        array[0][1] = "sifre";

        array[1][0] = "manager2";
        array[1][1] = "sifre";

        array[2][0] = ConfigurationReader.getProperty("fhc_username");
        array[2][1] = ConfigurationReader.getProperty("fhc_password");

        return array;




    }





}
