package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhctripHotelCreatePage {

    WebDriver driver;
    public FhctripHotelCreatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy (id ="Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy (id ="Address")
    public WebElement adress;

    @FindBy(id = "Phone")
    public WebElement phone;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "IDGroup")
    public WebElement idGroup;

    @FindBy(id = "btnSubmit")
    public WebElement submit;







}
