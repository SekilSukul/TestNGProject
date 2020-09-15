package com.techproed.smoketests;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBase {


    @Test
    public void facebookLoginTest (){
        driver.get("http://facebook.com");

        FacebookLoginPage loginPage = new FacebookLoginPage(driver);

        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("facebook_email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("facebook_pass"));





    }












}
