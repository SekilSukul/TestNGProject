package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    WebDriver driver;
    public AmazonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(partialLinkText = "Hello, Sign in")
    public WebElement helloSignIn;

    @FindBy(partialLinkText = "Sign in")
    public WebElement signIn;

    @FindBy(id = "ap_email")
    public WebElement emailBox;






}
