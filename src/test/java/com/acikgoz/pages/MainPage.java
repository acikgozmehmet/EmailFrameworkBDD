package com.acikgoz.pages;

import com.acikgoz.utilities.BrowserUtils;
import com.acikgoz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(css = "div.z0>div")
    public WebElement composeBtn;

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void composeMail(){
        BrowserUtils.waitForClickablility(composeBtn, 30);
        composeBtn.click();
    }
}
