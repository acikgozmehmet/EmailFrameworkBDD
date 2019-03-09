package com.acikgoz.pages;

import com.acikgoz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMessagePage {

    //textarea[@name='to']
//    @FindBy(xpath = "//div[@class='aSt']//div[@id=':9k']//input")
    @FindBy(xpath = "//textarea[@name='to']")
    public WebElement toInput;

    @FindBy(xpath = "//input[@name='subjectbox']")
    public WebElement subjectInput;

    @FindBy(xpath = "//div[@class='Ar Au']//div")
    public  WebElement textFieldInput;

    @FindBy(xpath = "//td[@class='gU Up']//div[.='Send']")
    public WebElement sendBtn;

    @FindBy(xpath = "//a[@title='Sent']")
    public WebElement sendLink;

    @FindBy(xpath = "//div[@data-tooltip='Attach files']")
    public WebElement attachFilesBtn;

    public NewMessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
