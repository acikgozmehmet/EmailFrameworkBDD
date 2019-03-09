package com.acikgoz.pages;

import com.acikgoz.utilities.BrowserUtils;
import com.acikgoz.utilities.ConfigurationReader;
import com.acikgoz.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "identifierId")
    public WebElement emailInput;

    @FindBy(css = "input[type='password']" )
    public WebElement passwordInput;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login(String email, String password){
        emailInput.sendKeys(email + Keys.ENTER);
        BrowserUtils.waitForVisibility(passwordInput, 30);
        passwordInput.sendKeys(password+Keys.ENTER);
    }

    public void login(){
        String email = ConfigurationReader.getProperty("e-mail");
        String password = ConfigurationReader.getProperty("password");
        emailInput.sendKeys(email + Keys.ENTER);
        BrowserUtils.waitForVisibility(passwordInput, 30);
        passwordInput.sendKeys(password + Keys.ENTER);
    }


}
